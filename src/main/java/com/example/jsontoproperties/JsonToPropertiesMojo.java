package com.example.jsontoproperties;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * maven plugin to generate property file from json
 */
@Mojo(name = "version", defaultPhase = LifecyclePhase.INITIALIZE)
public class JsonToPropertiesMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project.basedir}/src/main/resources/generator.json", property = "inputFile", required = true)
    private File inputFile;

    @Parameter(defaultValue = "${project.basedir}/src/main/resources/generated.properties", property = "outputFile", required = true)
    private File outputFile;

    @Override
    public void execute() {
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            ObjectMapper mapper = new ObjectMapper();
            Configurations configurations = mapper.readValue(inputFile, Configurations.class);
            List<Configuration> configurationsList = configurations.getConfigurations();

            for (Configuration c : configurationsList) {
                String prefix = flatten(c);
                fileWriter.write(prefix);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String flatten(Configuration c) {
        StringBuilder pre = new StringBuilder();

        appendIfNotNull(pre, c.getName(), "type", c.getType());
        appendIfNotNull(pre, c.getName(), "lang", c.getLang());
        appendIfNotNull(pre, c.getName(), "db_name", c.getDb_name());
        appendIfNotNull(pre, c.getName(), "schema_name", c.getSchema_name());
        appendIfNotNull(pre, c.getName(), "user", c.getUser());
        appendIfNotNull(pre, c.getName(), "jdbcDriver", c.getJdbcDriver());
        appendIfNotNull(pre, c.getName(), "password", c.getPassword());
        appendIfNotNull(pre, c.getName(), "url", c.getUrl());
        appendIfNotNull(pre, c.getName(), "pu_name", c.getPu_name());
        appendIfNotNull(pre, c.getName(), "provider", c.getProvider());
        appendIfNotNull(pre, c.getName(), "db_cfg_name", c.getDb_cfg_name());
        appendIfNotNull(pre, c.getName(), "ddl_gen_actions", c.getDdl_gen_actions());
        appendIfNotNull(pre, c.getName(), "ddl_gen_mode", c.getDdl_gen_mode());
        appendIfNotNull(pre, c.getName(), "create_ddl_filename", c.getCreate_ddl_filename());
        appendIfNotNull(pre, c.getName(), "drop_ddl_filename", c.getDrop_ddl_filename());
        appendIfNotNull(pre, c.getName(), "log_level", c.getLog_level());
        appendIfNotNull(pre, c.getName(), "log_params", c.getLog_params());
        appendIfNotNull(pre, c.getName(), "log_timestamp", c.getLog_timestamp());
        appendIfNotNull(pre, c.getName(), "log_exceptions", c.getLog_exceptions());
        appendIfNotNull(pre, c.getName(), "ssn_customizer", c.getSsn_customizer());
        appendIfNotNull(pre, c.getName(), "ssn_evt_listener", c.getSsn_evt_listener());

        if (c.getAdd_props() != null) {
            for (Map.Entry<String, String> entry : c.getAdd_props().entrySet()) {
                appendIfNotNull(pre, c.getName(), "add_props." + entry.getKey(), entry.getValue());
            }
        }

        pre.append("\n");
        return pre.toString();
    }

    private void appendIfNotNull(StringBuilder sb, String name, String key, String value) {
        if (value != null) {
            sb.append(name).append('.').append(key).append('=').append(value).append('\n');
        }
    }
}
