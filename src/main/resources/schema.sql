-- executed by spring boot on H2 DB at test and application start time
/*CREATE TABLE IF NOT EXISTS PUBLISHERS  (
  ID               INT          NOT NULL AUTO_INCREMENT  PRIMARY KEY
  ,NAME             VARCHAR(255) NOT NULL CONSTRAINT PUBLISHERS_NAME_UC UNIQUE
  ,PHONE            VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS BOOKS (
  ID                  INT          NOT NULL  AUTO_INCREMENT PRIMARY KEY
  ,ISBN               VARCHAR(13)  NOT NULL  CONSTRAINT books_isbn_uc UNIQUE
  ,AUTHOR_FIRST_NAME  VARCHAR(255) NOT NULL
  ,AUTHOR_LAST_NAME   VARCHAR(255) NOT NULL
  ,TITLE              VARCHAR(255) NOT NULL
  ,DESCRIPTION        VARCHAR(750) NOT NULL
  ,GENRE	            VARCHAR(255) NOT NULL
  ,PRICE              DOUBLE       NOT NULL
  ,PUBLISHER          VARCHAR(255)
  ,PUBLISHED_ON       DATE
);


CREATE TABLE IF NOT EXISTS  USERS (
  ID               INT         NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  USER_NAME        VARCHAR(15) NOT NULL CONSTRAINT users_username_UC UNIQUE,
  FIRST_NAME       VARCHAR(50) NOT NULL,
  LAST_NAME        VARCHAR(50) NOT NULL,
  ACTIVE_SINCE     DATE,
);*/