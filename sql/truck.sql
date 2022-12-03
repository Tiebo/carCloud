create table truck
(
    vehicle_id varchar(45) not null
        primary key,
    user_id    int         null,
    brand      varchar(20) null,
    tonnage    int         null,
    price      int         null,
    date       varchar(20) null,
    constraint truck_vehicle_id_uindex
        unique (vehicle_id),
    constraint truck_user_id_fk
        foreign key (user_id) references user (id)
);

INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京A-T6H48', 0, '宇通', 30, 1039, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京B-B4F40', 0, '东风', 20, 668, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京C-F5M56', 0, '宇通', 35, 1245, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京F-C8M51', 0, '沃尔沃', 25, 995, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京G-W4H74', 0, '宇通', 30, 492, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京H-Q0P38', 0, '解放', 25, 1191, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京I-A2U50', 0, '宇通', 35, 1084, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京I-F5D38', 0, '东风', 25, 650, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京J-B5V18', 0, '东风', 10, 680, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京J-H6I57', 0, '宇通', 10, 393, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京L-J3G58', 0, '沃尔沃', 20, 1123, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京L-Q3K21', 0, '沃尔沃', 10, 860, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京L-Y8A56', 0, '东风', 30, 365, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京M-O0K71', 0, '东风', 10, 850, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京N-W1K16', 0, '东风', 10, 890, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京P-Q5I38', 0, '沃尔沃', 30, 573, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京Q-E4M47', 0, '解放', 10, 300, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京Q-U1R68', 0, '宇通', 10, 472, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京R-J2O51', 0, '沃尔沃', 20, 648, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京R-O4H15', 0, '东风', 25, 552, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京U-C3K10', 0, '宇通', 25, 897, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京U-U7P07', 0, '沃尔沃', 35, 345, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京V-I4V60', 0, '沃尔沃', 20, 1118, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京W-J4O70', 0, '沃尔沃', 25, 801, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('京X-O6S44', 0, '东风', 10, 1007, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川A-L1E65', 0, '沃尔沃', 10, 747, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川B-D7Q00', 0, '宇通', 20, 659, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川B-R2K72', 0, '解放', 35, 437, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川C-N2U16', 0, '沃尔沃', 35, 969, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川D-K3U00', 0, '沃尔沃', 10, 647, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川D-R8P06', 0, '解放', 10, 423, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川D-W4C07', 0, '沃尔沃', 30, 606, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川E-P7N45', 0, '宇通', 30, 1028, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川E-S5O07', 1, '沃尔沃', 25, 850, '1670306334596');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川E-X5C71', 0, '沃尔沃', 20, 754, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川F-D8E53', 0, '东风', 25, 515, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川G-C0K58', 0, '东风', 25, 1094, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川G-Q4X31', 0, '宇通', 25, 706, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川H-G0J80', 0, '宇通', 35, 811, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川H-Q5F73', 0, '解放', 10, 1204, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川H-V4K37', 0, '宇通', 30, 432, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川J-U7E72', 0, '解放', 10, 837, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川K-M7B31', 0, '东风', 25, 670, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川L-M4Y30', 0, '沃尔沃', 20, 371, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川L-R5V08', 0, '东风', 35, 484, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川N-H8F33', 0, '解放', 30, 1098, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川N-L7A10', 0, '宇通', 10, 1157, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川N-V1E72', 0, '解放', 20, 458, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川O-I8G01', 0, '解放', 30, 843, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川O-K1W21', 0, '宇通', 20, 377, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川O-U4C30', 0, '东风', 30, 563, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川O-V7P06', 0, '宇通', 25, 1246, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川O-Y0C82', 0, '东风', 20, 1048, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川P-J0P76', 0, '沃尔沃', 35, 584, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川Q-V0V36', 0, '沃尔沃', 25, 702, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川R-F1B66', 0, '宇通', 25, 1136, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川T-Y1N45', 0, '东风', 25, 670, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川V-A5B57', 0, '解放', 35, 1213, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川V-J2J15', 0, '解放', 25, 491, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川V-L6E07', 0, '解放', 10, 900, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川V-N0G46', 0, '东风', 10, 844, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川V-U7Q41', 0, '东风', 35, 974, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川W-N8I02', 0, '解放', 20, 592, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('川X-A0H11', 0, '沃尔沃', 10, 758, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆A-O8D31', 0, '东风', 30, 783, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆B-G6F67', 0, '宇通', 10, 1097, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆B-Q4T24', 0, '解放', 25, 970, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆C-C1A28', 0, '沃尔沃', 30, 301, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆D-T2I16', 0, '沃尔沃', 20, 895, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆E-C1Q76', 0, '宇通', 20, 353, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆E-R6N75', 0, '解放', 10, 502, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆G-J2W16', 0, '东风', 20, 665, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆G-R4F50', 0, '东风', 10, 562, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆H-G2E15', 0, '沃尔沃', 30, 1255, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆I-D8R50', 0, '东风', 25, 361, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆I-K1U17', 0, '沃尔沃', 10, 861, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆I-N7V20', 0, '宇通', 30, 891, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆L-F7N15', 0, '东风', 20, 378, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆N-Q2V88', 0, '东风', 35, 1091, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆N-Y3J36', 0, '沃尔沃', 10, 734, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆P-D8X86', 0, '沃尔沃', 30, 893, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆Q-U1L12', 0, '东风', 25, 559, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆Q-V1U55', 0, '沃尔沃', 35, 698, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆R-G0Q02', 0, '解放', 25, 470, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆R-V4F52', 0, '宇通', 35, 1066, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆S-H8N68', 0, '东风', 30, 718, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆T-W1F80', 0, '东风', 35, 508, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆V-S6Y03', 0, '东风', 25, 1214, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('睆X-M5U40', 0, '沃尔沃', 20, 1100, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫A-A1L28', 0, '解放', 20, 705, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫A-J1I63', 0, '东风', 30, 485, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫C-D8J23', 0, '解放', 10, 1052, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫G-I5B04', 0, '东风', 30, 767, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫J-M4N22', 0, '解放', 25, 1259, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫J-U1E81', 0, '沃尔沃', 25, 963, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫O-B4R10', 0, '宇通', 10, 1165, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫O-G8G61', 0, '东风', 20, 932, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫O-K7M02', 0, '沃尔沃', 30, 1076, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫R-R6O68', 0, '沃尔沃', 25, 1242, '0');
INSERT INTO rentcar.truck (vehicle_id, user_id, brand, tonnage, price, date) VALUES ('豫Y-V0G53', 0, '解放', 20, 680, '0');
