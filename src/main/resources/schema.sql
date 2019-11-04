DROP TABLE IF EXISTS routes;

CREATE TABLE routes (
                          route_id        VARCHAR(100) PRIMARY KEY NOT NULL,
                          servicename      TEXT NOT NULL,
                          active      CHAR(1) NOT NULL,
                          endpoint       VARCHAR(100)   NOT NULL,
                          weight INT    );


INSERT INTO routes (route_id,  serviceName, active, endpoint, weight)
VALUES ('f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a', 'licensingservice', 'Y','licensingservicebeta', 50);