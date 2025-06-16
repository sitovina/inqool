INSERT INTO Customer (id, first_name, last_name, phone) VALUES (1, 'adam', 'bral', '60666666');
INSERT INTO Customer (id, first_name, last_name, phone) VALUES (2, 'bara', 'crad', '2164');

INSERT INTO Court (id, cost) VALUES (1, 45.0);
INSERT INTO Court (id, cost) VALUES (2, 23.0);

INSERT INTO Reservation (id, court_id, owner_id, cost) VALUES (5, 1, 1, 12);
INSERT INTO Reservation (id, court_id, owner_id, cost) VALUES (6, 1, 2, 12);
INSERT INTO Reservation (id, court_id, owner_id, cost) VALUES (7, 2, 2, 12);