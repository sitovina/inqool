INSERT INTO Customer (id, first_name, last_name, phone) VALUES (1, 'adam', 'bral', '60666666');
INSERT INTO Customer (id, first_name, last_name, phone) VALUES (2, 'bara', 'crad', '2164');

INSERT INTO Court (id, cost) VALUES (1, 45.0);
INSERT INTO Court (id, cost) VALUES (2, 23.0);

INSERT INTO Reservation (id, court_id, owner_id, cost, reservation_start, reservation_end) VALUES (5, 1, 1, 12, '2020-08-21 00:00:00', '2020-08-21 01:00:00');
INSERT INTO Reservation (id, court_id, owner_id, cost, reservation_start, reservation_end) VALUES (6, 1, 2, 12, '2025-06-17 15:00:00', '2025-06-17 16:00:00');
INSERT INTO Reservation (id, court_id, owner_id, cost, reservation_start, reservation_end) VALUES (7, 1, 2, 12, '2025-06-17 08:00:00', '2025-06-17 09:00:00');
INSERT INTO Reservation (id, court_id, owner_id, cost) VALUES (8, 2, 2, 12);