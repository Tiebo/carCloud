create table income
(
    id         int auto_increment
        primary key,
    vehicle_id varchar(40) not null,
    user_id    int         null,
    days       int         null,
    amount     int         null,
    time       varchar(40) null,
    constraint income_id_uindex
        unique (id),
    constraint income_user_id_fk
        foreign key (user_id) references user (id)
);

create index income_all_car_vehicle_id_fk
    on income (vehicle_id);

INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (1, '京I-Y7Y36', 1, 5, 4465, '2022-12-03 01:58:09');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (2, '京O-R4K44', 1, 6, 6210, '2022-12-03 01:58:26');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (3, '京D-X8O67', 1, 7, 168, '2022-12-03 01:58:40');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (4, '川E-S5O07', 1, 3, 2550, '2022-12-03 01:58:54');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (5, '京A-T4V50', 27, 5, 3990, '2022-12-03 04:27:39');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (6, '京A-T3J10', 27, 5, 120, '2022-12-03 04:28:31');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (7, '京A-T4V50', 27, 0, 0, '2022-12-03 04:29:02');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (8, '川E-P2C15', 1, 5, 4255, '2022-12-03 08:11:35');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (9, '京I-Y7Y36', 1, 0, 0, '2022-12-03 08:12:32');
INSERT INTO rentcar.income (id, vehicle_id, user_id, days, amount, time) VALUES (10, '京D-X8O67', 1, 0, 0, '2022-12-03 08:12:35');
