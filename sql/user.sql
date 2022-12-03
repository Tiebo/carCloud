create table user
(
    id       int auto_increment
        primary key,
    name     varchar(40)  default '无名者' null,
    account  varchar(20)                   not null,
    password varchar(20)                   not null,
    rent_car varchar(200) default '0'      null,
    balance  int          default 500      null,
    gender   varchar(10)                   null,
    is_admin int          default 0        null,
    constraint user_id_uindex
        unique (id)
);

INSERT INTO rentcar.user (id, name, account, password, rent_car, balance, gender, is_admin) VALUES (0, '无', '-1', '-1', '-1', -1, '男', 0);
INSERT INTO rentcar.user (id, name, account, password, rent_car, balance, gender, is_admin) VALUES (1, 'Tiebo', '123', '123', '京O-R4K44,川E-S5O07,川E-P2C15', 366836, '男', 1);
INSERT INTO rentcar.user (id, name, account, password, rent_car, balance, gender, is_admin) VALUES (2, '张思', '2', '2', '0', 50000, '男', 0);
INSERT INTO rentcar.user (id, name, account, password, rent_car, balance, gender, is_admin) VALUES (27, '哈哈哈', '123456789', '1111111111', '京A-T3J10', 4678, '女', 0);
