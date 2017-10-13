CREATE TABLE IF NOT EXISTS version_history (
  script_version VARCHAR(500) NOT NULL,
  script_exec_timestamp TIMESTAMP NOT NULL
);

ALTER TABLE version_history ADD CONSTRAINT uq01_version_history UNIQUE (script_version);

INSERT INTO version_history VALUES ('V20171013.001__Initial_data_model.sql', current_date);