create table car
(
    vehicle_id varchar(45)   not null
        primary key,
    user_id    int default 0 null,
    brand      varchar(45)   null,
    type       varchar(45)   null,
    price      int           null,
    date       varchar(20)   null,
    constraint car_user_id_fk
        foreign key (user_id) references user (id)
);

INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京A-T4V50', 0, '奔驰', 'N2', 798, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京C-X3D82', 0, '奥迪', 'K7', 306, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京D-G6F84', 0, '奥迪', 'S7', 371, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京F-A7M55', 0, '奔驰', 'WW', 666, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京I-B8O13', 0, '宝马', 'Q8', 331, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京I-L1B28', 0, '宝马', 'P8', 347, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京I-Y7Y36', 0, '宝马', 'O2', 893, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京J-W3Y04', 0, '宝马', 'Y5', 1130, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京M-H2R08', 0, '奥迪', 'X4', 1084, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京M-I1L54', 0, '宝马', 'I8', 1296, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京O-R4K44', 1, '奔驰', 'J2', 1035, '1670565506531');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京P-Q8B75', 0, '奔驰', 'L3', 622, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京Q-K1F01', 0, '奥迪', 'T6', 771, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京R-J4W88', 0, '奔驰', 'Q2', 931, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京S-S1P12', 0, '奔驰', 'B7', 559, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京S-W3Y85', 0, '奥迪', 'H8', 449, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京S-W7U37', 0, '奔驰', 'U3', 560, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京U-A8G64', 0, '法拉利', 'V6', 1096, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京U-C8O22', 0, '奔驰', 'B2', 996, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京U-W7S71', 0, '宝马', 'B3', 922, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京V-G7K80', 0, '宝马', 'X8', 1020, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('京Y-L1D25', 0, '法拉利', 'D1', 811, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川A-F6A03', 0, '法拉利', 'D5', 948, '1673099986359');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川A-L3M11', 0, '奔驰', 'L6', 568, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川A-O7X31', 0, '奥迪', 'H0', 655, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川A-P2H13', 0, '宝马', 'C4', 1016, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川A-S0M78', 0, '宝马', 'I6', 666, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川B-BBBBB', 0, '奔驰', 'HH', 555, '1670056262556');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川B-L1M25', 0, '宝马', 'E5', 819, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川B-M5O58', 0, '奔驰', 'M7', 701, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川D-T2S33', 0, '奥迪', 'P2', 992, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川D-V6K73', 0, '宝马', 'M8', 1040, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川E-C0H82', 0, '法拉利', 'W0', 320, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川E-P2C15', 1, '宝马', 'D5', 851, '1670501495519');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川E-T6E70', 0, '奥迪', 'F4', 585, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川E-V7E03', 0, '宝马', 'I1', 1280, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川G-C3X54', 0, '奔驰', 'M4', 401, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川H-E3X48', 0, '奥迪', 'P1', 941, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川H-R6I33', 0, '宝马', 'R2', 449, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川I-R2W64', 0, '奥迪', 'R3', 387, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川L-F5S88', 0, '宝马', 'C8', 1259, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川L-S2Y68', 0, '宝马', 'O3', 338, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川M-C2P52', 0, '法拉利', 'S7', 1213, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川M-G3K75', 0, '奥迪', 'O7', 330, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川M-P2G00', 0, '宝马', 'L5', 427, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川N-H3W48', 0, '奔驰', 'K6', 529, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川N-W4P72', 0, '奔驰', 'G7', 540, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川O-C6P65', 0, '奔驰', 'Q4', 1203, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川P-A6R48', 0, '法拉利', 'S8', 713, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川P-M4L76', 0, '奥迪', 'A7', 993, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川Q-C6Q21', 0, '奥迪', 'P5', 663, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川V-U0A46', 0, '奔驰', 'U3', 339, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川W-B5O21', 0, '奥迪', 'F0', 823, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川W-J8Y13', 0, '法拉利', 'E4', 448, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川X-K8H44', 0, '奥迪', 'I7', 950, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川X-R5N20', 0, '宝马', 'L1', 750, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('川X-T5V87', 0, '宝马', 'C3', 742, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆F-E2P34', 0, '宝马', 'Y0', 570, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆G-D7S16', 0, '奥迪', 'B6', 455, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆G-J5X22', 0, '宝马', 'K2', 1103, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆H-C6K20', 0, '奔驰', 'K1', 1066, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆H-H7I75', 0, '法拉利', 'K3', 625, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆H-O5X23', 0, '宝马', 'T8', 1250, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆I-S3J05', 0, '奔驰', 'N1', 330, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆K-G4N64', 0, '奔驰', 'P7', 1172, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆L-Q4V84', 0, '法拉利', 'F3', 989, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆M-J4H86', 0, '宝马', 'A4', 430, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆M-W1N52', 0, '奥迪', 'X3', 744, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆N-T3D81', 0, '奥迪', 'D0', 1038, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆R-B1F80', 0, '宝马', 'O8', 606, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆R-C5G44', 0, '宝马', 'B1', 545, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆T-F0D85', 0, '宝马', 'K6', 1207, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆T-R8E31', 0, '法拉利', 'K1', 760, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆T-U6E25', 0, '奥迪', 'X5', 1248, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆U-Q3D88', 0, '宝马', 'I2', 919, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆U-Y2W47', 0, '法拉利', 'D2', 1247, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆W-G5J20', 0, '奥迪', 'T1', 431, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆W-G6M86', 0, '法拉利', 'A6', 326, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆Y-A0S03', 0, '奔驰', 'I5', 561, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('睆Y-I3V33', 0, '奔驰', 'W0', 428, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫A-U6Q86', 0, '奔驰', 'F1', 895, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫D-C8W25', 0, '法拉利', 'A1', 359, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫D-S2H16', 0, '奔驰', 'G3', 701, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫D-T2Q47', 0, '宝马', 'C7', 708, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫E-E6G16', 0, '奔驰', 'G6', 1267, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫F-L2J77', 0, '法拉利', 'K8', 1000, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫H-N8W61', 0, '法拉利', 'D3', 1037, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫J-G1G41', 0, '奥迪', 'R8', 359, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫O-C2B75', 0, '奔驰', 'V7', 648, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫W-N4T68', 0, '法拉利', 'M3', 1279, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫W-U8I78', 0, '宝马', 'H2', 1217, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫X-D4H30', 0, '奥迪', 'R4', 1244, '0');
INSERT INTO rentcar.car (vehicle_id, user_id, brand, type, price, date) VALUES ('豫X-P4A26', 0, '奔驰', 'E1', 918, '0');
