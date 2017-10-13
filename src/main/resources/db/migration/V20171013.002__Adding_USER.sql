INSERT INTO version_history VALUES ('V20171013.002__Adding_USER.sql', current_date);

CREATE TABLE user (
	id BIGINT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(32),
	last_name VARCHAR(32),
	PRIMARY KEY(id)
);


