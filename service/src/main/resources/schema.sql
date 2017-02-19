
-- fun-fact; if you are using MySQL, case-sensitivity is important in some implementations.
-- Hibernate lowercases everything.

CREATE TABLE top_talent_entity (
    Id      INTEGER         PRIMARY KEY AUTO_INCREMENT,
    Name    VARCHAR(10)
);