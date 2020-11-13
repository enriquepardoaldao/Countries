
INSERT INTO autonomous_community(name, area) VALUES('Galicia', 29574);
INSERT INTO autonomous_community(name, area) VALUES('Madrid', 604);
INSERT INTO autonomous_community(name, area) VALUES('Catalunya', 32108);


INSERT INTO province(name, autonomous_community_id) VALUES ('A Coruña', 1);
INSERT INTO province(name, autonomous_community_id) VALUES ('Lugo', 1);
INSERT INTO province(name, autonomous_community_id) VALUES ('Ourense', 1);
INSERT INTO province(name, autonomous_community_id) VALUES ('Pontevedra', 1);

INSERT INTO province(name, autonomous_community_id) VALUES ('Madrid', 2);

INSERT INTO province(name, autonomous_community_id) VALUES ('Barcelona', 3);
INSERT INTO province(name, autonomous_community_id) VALUES ('Gerona', 3);
INSERT INTO province(name, autonomous_community_id) VALUES ('Lérida', 3);
INSERT INTO province(name, autonomous_community_id) VALUES ('Tarragona', 3);

INSERT INTO city(name, population, province_id) VALUES ('A Coruña', 245711, 1);
INSERT INTO city(name, population, province_id) VALUES ('Santiago', 96405, 1);

INSERT INTO city(name, population, province_id) VALUES ('Alcorcón', 169502, 2);
INSERT INTO city(name, population, province_id) VALUES ('Aranjuez', 59037, 2);
INSERT INTO city(name, population, province_id) VALUES ('Galapagar', 33379, 2);


INSERT INTO city(name, population, province_id) VALUES ('Vigo', 293642, 4);

INSERT INTO city(name, population, province_id) VALUES ('Barcelona', 1636762, 5);


INSERT INTO city(name, population, province_id) VALUES ('Ripollés', 25700, 6);
INSERT INTO city(name, population, province_id) VALUES ('Cerdanya', 16862, 6);