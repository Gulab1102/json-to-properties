package com.example.jsontoproperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Configuration {

    private String type;
    private String name;
    private String lang;
    private String db_name;
    private String schema_name;
    private String user;
    private String jdbcDriver;
    private String password;
    private String url;
    private String pu_name;
    private String provider;
    private String db_cfg_name;
    private String ddl_gen_actions;
    private String ddl_gen_mode;
    private String create_ddl_filename;
    private String drop_ddl_filename;
    private String log_level;
    private String log_params;
    private String log_timestamp;
    private String log_exceptions;
    private String ssn_customizer;
    private String ssn_evt_listener;
    private Map<String, String> add_props;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getDb_name() {
        return db_name;
    }

    public void setDb_name(String db_name) {
        this.db_name = db_name;
    }

    public String getSchema_name() {
        return schema_name;
    }

    public void setSchema_name(String schema_name) {
        this.schema_name = schema_name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPu_name() {
        return pu_name;
    }

    public void setPu_name(String pu_name) {
        this.pu_name = pu_name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDb_cfg_name() {
        return db_cfg_name;
    }

    public void setDb_cfg_name(String db_cfg_name) {
        this.db_cfg_name = db_cfg_name;
    }

    public String getDdl_gen_actions() {
        return ddl_gen_actions;
    }

    public void setDdl_gen_actions(String ddl_gen_actions) {
        this.ddl_gen_actions = ddl_gen_actions;
    }

    public String getDdl_gen_mode() {
        return ddl_gen_mode;
    }

    public void setDdl_gen_mode(String ddl_gen_mode) {
        this.ddl_gen_mode = ddl_gen_mode;
    }

    public String getCreate_ddl_filename() {
        return create_ddl_filename;
    }

    public void setCreate_ddl_filename(String create_ddl_filename) {
        this.create_ddl_filename = create_ddl_filename;
    }

    public String getDrop_ddl_filename() {
        return drop_ddl_filename;
    }

    public void setDrop_ddl_filename(String drop_ddl_filename) {
        this.drop_ddl_filename = drop_ddl_filename;
    }

    public String getLog_level() {
        return log_level;
    }

    public void setLog_level(String log_level) {
        this.log_level = log_level;
    }

    public String getLog_params() {
        return log_params;
    }

    public void setLog_params(String log_params) {
        this.log_params = log_params;
    }

    public String getLog_timestamp() {
        return log_timestamp;
    }

    public void setLog_timestamp(String log_timestamp) {
        this.log_timestamp = log_timestamp;
    }

    public String getLog_exceptions() {
        return log_exceptions;
    }

    public void setLog_exceptions(String log_exceptions) {
        this.log_exceptions = log_exceptions;
    }

    public String getSsn_customizer() {
        return ssn_customizer;
    }

    public void setSsn_customizer(String ssn_customizer) {
        this.ssn_customizer = ssn_customizer;
    }

    public String getSsn_evt_listener() {
        return ssn_evt_listener;
    }

    public void setSsn_evt_listener(String ssn_evt_listener) {
        this.ssn_evt_listener = ssn_evt_listener;
    }

    public Map<String, String> getAdd_props() {
        return add_props;
    }

    public void setAdd_props(Map<String, String> add_props) {
        this.add_props = add_props;
    }
}
