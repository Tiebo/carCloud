create table bus
(
    vehicle_id varchar(45) not null
        primary key,
    user_id    int         null,
    brand      varchar(25) null,
    seat       int         null,
    price      int         null,
    date       varchar(20) null,
    constraint bus_user_id_fk
        foreign key (user_id) references user (id)
);

INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京A-T3J10', 27, '东风', 1117, 24, '1670488111912');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京B-H3X01', 0, '东风', 1296, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京C-M1W04', 0, '宇通', 474, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京C-P6K01', 0, '金杯', 431, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京D-T7E84', 0, '金龙', 569, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京D-X8O67', 0, '宇通', 903, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京F-V8L17', 0, '金杯', 590, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京J-N8G05', 0, '金杯', 1181, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京L-K8Y00', 0, '宇通', 1053, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京L-V1B47', 0, '宇通', 667, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京N-R7R31', 0, '金杯', 16, 896, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京P-A0I30', 0, '金杯', 724, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京Q-V2P86', 0, '金龙', 896, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京S-R8G88', 0, '宇通', 830, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京V-W8Y03', 0, '宇通', 769, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京W-M6M43', 0, '金杯', 444, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京X-S7R10', 0, '东风', 544, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('京X-T6Q10', 0, '东风', 1228, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川A-B5A54', 0, '金龙', 926, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川A-M0K17', 0, '金龙', 632, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川C-U0M85', 0, '金杯', 583, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川D-E4X32', 0, '金龙', 915, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川D-Q5B34', 0, '东风', 744, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川D-T5Y74', 0, '东风', 1016, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川E-C8W51', 0, '东风', 880, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川E-J5H45', 0, '东风', 494, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川F-L7Q55', 0, '宇通', 637, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川F-Y1I28', 0, '金杯', 678, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川G-C8L52', 0, '金龙', 1296, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川G-H7W03', 0, '东风', 758, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川G-L0W03', 0, '金龙', 626, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川I-H4W46', 0, '宇通', 1027, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川I-H6U22', 0, '东风', 452, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川I-U7G73', 0, '金杯', 720, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川J-E4D88', 0, '金龙', 680, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川J-U1L82', 0, '东风', 24, 1073, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川N-E5F53', 0, '宇通', 1070, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川N-J6I72', 0, '金杯', 1028, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川O-A4C28', 0, '宇通', 1280, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川O-S0J47', 0, '金杯', 1165, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川P-I6T86', 0, '金杯', 718, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川Q-H7F58', 0, '东风', 942, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川R-J7H66', 0, '宇通', 543, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川R-P5B30', 0, '金杯', 988, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川R-U0F87', 0, '金杯', 24, 647, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川S-I8C78', 0, '宇通', 818, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川T-S2I11', 0, '东风', 660, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川V-F1U22', 0, '金龙', 1068, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川V-J3P56', 0, '金龙', 1154, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川V-X6Q61', 0, '金龙', 1093, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川W-E8V53', 0, '金龙', 1036, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川X-F8R00', 0, '金杯', 815, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('川X-N4W71', 0, '东风', 819, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆B-L8W02', 0, '金杯', 990, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆C-G6H26', 0, '东风', 1288, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆D-Y2I54', 0, '金杯', 536, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆F-N6C38', 0, '金龙', 608, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆F-W8M38', 0, '宇通', 796, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆I-C0D58', 0, '金龙', 480, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆L-P4C54', 0, '东风', 1298, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆N-W3E71', 0, '东风', 32, 377, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆Q-K2H87', 0, '宇通', 48, 428, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆Q-K8A10', 0, '金龙', 997, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆Q-L7D88', 0, '金杯', 439, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆Q-O2R40', 0, '金杯', 410, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆S-K0A58', 0, '东风', 664, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆S-O3X45', 0, '金杯', 1153, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆T-V0Y36', 0, '金杯', 856, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆V-A4U55', 0, '金杯', 572, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆V-I3A72', 0, '金杯', 995, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆V-P1A87', 0, '宇通', 367, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆V-T1S47', 0, '金龙', 440, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆W-R1A60', 0, '宇通', 893, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆X-E7T16', 0, '东风', 1237, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('睆X-X1N20', 0, '金杯', 539, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫A-D4G80', 0, '金杯', 920, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫A-E8F82', 0, '东风', 1181, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫B-I6G61', 0, '东风', 1034, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫C-C0K88', 0, '金杯', 392, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫D-K6Y10', 0, '东风', 402, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫E-K1Y64', 0, '金杯', 659, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫H-I6B66', 0, '金杯', 352, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫H-K7F47', 0, '金杯', 1268, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫H-M8M65', 0, '东风', 1105, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫J-J6U16', 0, '东风', 1283, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫J-K1A40', 0, '金龙', 693, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫J-K4M01', 0, '金杯', 683, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫J-Y8W63', 0, '东风', 1290, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫K-B8R37', 0, '金龙', 455, 48, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫L-U0X54', 0, '金龙', 897, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫Q-G2R78', 0, '金龙', 1067, 32, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫R-O6E44', 0, '宇通', 1297, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫S-M8S14', 0, '宇通', 1028, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫T-F3S54', 0, '金杯', 889, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫T-J1Y74', 0, '东风', 656, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫U-H6E37', 0, '东风', 808, 64, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫U-T4V50', 0, '宇通', 813, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫V-U7V11', 0, '金杯', 1260, 16, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫W-I0S40', 0, '东风', 911, 24, '0');
INSERT INTO rentcar.bus (vehicle_id, user_id, brand, seat, price, date) VALUES ('豫X-G8N46', 0, '宇通', 972, 32, '0');
