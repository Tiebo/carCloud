create table all_car
(
    id         int auto_increment
        primary key,
    vehicle_id varchar(45)          null,
    type       char(5) charset utf8 null,
    constraint all_car_id_uindex
        unique (id),
    constraint all_car_vehicle_id_uindex
        unique (vehicle_id)
);

INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (1, '京A-T4V50', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (2, '京C-X3D82', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (3, '京D-G6F84', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (4, '京F-A7M55', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (5, '京I-B8O13', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (6, '京I-L1B28', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (7, '京I-Y7Y36', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (8, '京J-W3Y04', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (9, '京M-H2R08', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (10, '京M-I1L54', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (11, '京O-R4K44', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (12, '京P-Q8B75', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (13, '京Q-K1F01', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (14, '京R-J4W88', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (15, '京S-S1P12', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (16, '京S-W3Y85', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (17, '京S-W7U37', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (18, '京U-A8G64', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (19, '京U-C8O22', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (20, '京U-W7S71', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (21, '京V-G7K80', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (22, '京Y-L1D25', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (23, '川A-F6A03', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (24, '川A-L3M11', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (25, '川A-O7X31', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (26, '川A-P2H13', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (27, '川A-S0M78', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (28, '川B-L1M25', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (29, '川B-M5O58', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (30, '川D-T2S33', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (31, '川D-V6K73', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (32, '川E-C0H82', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (33, '川E-P2C15', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (34, '川E-T6E70', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (35, '川E-V7E03', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (36, '川G-C3X54', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (37, '川H-E3X48', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (38, '川H-R6I33', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (39, '川I-R2W64', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (40, '川L-F5S88', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (41, '川L-S2Y68', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (42, '川M-C2P52', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (43, '川M-G3K75', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (44, '川M-P2G00', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (46, '川N-H3W48', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (47, '川N-W4P72', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (48, '川O-C6P65', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (49, '川P-A6R48', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (50, '川P-M4L76', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (51, '川Q-C6Q21', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (52, '川V-U0A46', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (53, '川W-B5O21', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (54, '川W-J8Y13', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (55, '川X-K8H44', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (56, '川X-R5N20', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (57, '川X-T5V87', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (58, '睆F-E2P34', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (59, '睆G-D7S16', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (60, '睆G-J5X22', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (61, '睆H-C6K20', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (62, '睆H-H7I75', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (63, '睆H-O5X23', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (64, '睆I-S3J05', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (65, '睆K-G4N64', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (66, '睆L-Q4V84', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (67, '睆M-J4H86', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (68, '睆M-W1N52', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (69, '睆N-T3D81', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (70, '睆R-B1F80', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (71, '睆R-C5G44', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (72, '睆T-F0D85', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (73, '睆T-R8E31', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (74, '睆T-U6E25', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (75, '睆U-Q3D88', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (76, '睆U-Y2W47', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (77, '睆W-G5J20', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (78, '睆W-G6M86', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (79, '睆Y-A0S03', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (80, '睆Y-I3V33', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (81, '豫A-U6Q86', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (82, '豫D-C8W25', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (83, '豫D-S2H16', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (84, '豫D-T2Q47', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (85, '豫E-E6G16', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (86, '豫F-L2J77', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (87, '豫H-N8W61', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (88, '豫J-G1G41', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (89, '豫O-C2B75', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (90, '豫W-N4T68', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (91, '豫W-U8I78', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (92, '豫X-D4H30', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (93, '豫X-P4A26', 'car');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (131, '京A-T3J10', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (132, '京B-H3X01', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (133, '京C-M1W04', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (134, '京C-P6K01', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (135, '京D-T7E84', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (136, '京D-X8O67', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (137, '京F-V8L17', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (138, '京J-N8G05', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (139, '京L-K8Y00', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (140, '京L-V1B47', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (141, '京N-R7R31', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (142, '京P-A0I30', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (143, '京Q-V2P86', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (144, '京S-R8G88', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (145, '京V-W8Y03', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (146, '京W-M6M43', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (147, '京X-S7R10', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (148, '京X-T6Q10', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (149, '川A-B5A54', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (150, '川A-M0K17', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (151, '川C-U0M85', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (152, '川D-E4X32', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (153, '川D-Q5B34', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (154, '川D-T5Y74', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (155, '川E-C8W51', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (156, '川E-J5H45', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (157, '川F-L7Q55', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (158, '川F-Y1I28', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (159, '川G-C8L52', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (160, '川G-H7W03', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (161, '川G-L0W03', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (162, '川I-H4W46', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (163, '川I-H6U22', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (164, '川I-U7G73', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (165, '川J-E4D88', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (166, '川J-U1L82', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (167, '川N-E5F53', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (168, '川N-J6I72', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (169, '川O-A4C28', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (170, '川O-S0J47', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (171, '川P-I6T86', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (172, '川Q-H7F58', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (173, '川R-J7H66', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (174, '川R-P5B30', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (175, '川R-U0F87', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (176, '川S-I8C78', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (177, '川T-S2I11', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (178, '川V-F1U22', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (179, '川V-J3P56', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (180, '川V-X6Q61', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (181, '川W-E8V53', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (182, '川X-F8R00', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (183, '川X-N4W71', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (184, '睆B-L8W02', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (185, '睆C-G6H26', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (186, '睆D-Y2I54', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (187, '睆F-N6C38', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (188, '睆F-W8M38', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (189, '睆I-C0D58', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (190, '睆L-P4C54', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (191, '睆N-W3E71', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (192, '睆Q-K2H87', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (193, '睆Q-K8A10', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (194, '睆Q-L7D88', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (195, '睆Q-O2R40', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (196, '睆S-K0A58', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (197, '睆S-O3X45', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (198, '睆T-V0Y36', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (199, '睆V-A4U55', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (200, '睆V-I3A72', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (201, '睆V-P1A87', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (202, '睆V-T1S47', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (203, '睆W-R1A60', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (204, '睆X-E7T16', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (205, '睆X-X1N20', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (206, '豫A-D4G80', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (207, '豫A-E8F82', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (208, '豫B-I6G61', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (209, '豫C-C0K88', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (210, '豫D-K6Y10', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (211, '豫E-K1Y64', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (212, '豫H-I6B66', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (213, '豫H-K7F47', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (214, '豫H-M8M65', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (215, '豫J-J6U16', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (216, '豫J-K1A40', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (217, '豫J-K4M01', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (218, '豫J-Y8W63', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (219, '豫K-B8R37', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (220, '豫L-U0X54', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (221, '豫Q-G2R78', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (222, '豫R-O6E44', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (223, '豫S-M8S14', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (224, '豫T-F3S54', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (225, '豫T-J1Y74', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (226, '豫U-H6E37', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (227, '豫U-T4V50', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (228, '豫V-U7V11', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (229, '豫W-I0S40', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (230, '豫X-G8N46', 'bus');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (231, '京A-T6H48', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (232, '京B-B4F40', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (233, '京C-F5M56', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (234, '京F-C8M51', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (235, '京G-W4H74', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (236, '京H-Q0P38', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (237, '京I-A2U50', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (238, '京I-F5D38', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (239, '京J-B5V18', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (240, '京J-H6I57', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (241, '京L-J3G58', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (242, '京L-Q3K21', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (243, '京L-Y8A56', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (244, '京M-O0K71', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (245, '京N-W1K16', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (246, '京P-Q5I38', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (247, '京Q-E4M47', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (248, '京Q-U1R68', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (249, '京R-J2O51', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (250, '京R-O4H15', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (251, '京U-C3K10', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (252, '京U-U7P07', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (253, '京V-I4V60', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (254, '京W-J4O70', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (255, '京X-O6S44', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (256, '川A-L1E65', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (257, '川B-D7Q00', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (258, '川B-R2K72', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (259, '川C-N2U16', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (260, '川D-K3U00', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (261, '川D-R8P06', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (262, '川D-W4C07', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (263, '川E-P7N45', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (264, '川E-S5O07', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (265, '川E-X5C71', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (266, '川F-D8E53', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (267, '川G-C0K58', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (268, '川G-Q4X31', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (269, '川H-G0J80', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (270, '川H-Q5F73', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (271, '川H-V4K37', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (272, '川J-U7E72', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (273, '川K-M7B31', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (274, '川L-M4Y30', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (275, '川L-R5V08', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (276, '川N-H8F33', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (277, '川N-L7A10', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (278, '川N-V1E72', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (279, '川O-I8G01', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (280, '川O-K1W21', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (281, '川O-U4C30', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (282, '川O-V7P06', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (283, '川O-Y0C82', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (284, '川P-J0P76', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (285, '川Q-V0V36', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (286, '川R-F1B66', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (287, '川T-Y1N45', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (288, '川V-A5B57', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (289, '川V-J2J15', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (290, '川V-L6E07', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (291, '川V-N0G46', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (292, '川V-U7Q41', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (293, '川W-N8I02', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (294, '川X-A0H11', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (295, '睆A-O8D31', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (296, '睆B-G6F67', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (297, '睆B-Q4T24', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (298, '睆C-C1A28', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (299, '睆D-T2I16', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (300, '睆E-C1Q76', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (301, '睆E-R6N75', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (302, '睆G-J2W16', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (303, '睆G-R4F50', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (304, '睆H-G2E15', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (305, '睆I-D8R50', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (306, '睆I-K1U17', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (307, '睆I-N7V20', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (308, '睆L-F7N15', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (309, '睆N-Q2V88', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (310, '睆N-Y3J36', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (311, '睆P-D8X86', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (312, '睆Q-U1L12', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (313, '睆Q-V1U55', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (314, '睆R-G0Q02', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (315, '睆R-V4F52', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (316, '睆S-H8N68', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (317, '睆T-W1F80', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (318, '睆V-S6Y03', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (319, '睆X-M5U40', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (320, '豫A-A1L28', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (321, '豫A-J1I63', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (322, '豫C-D8J23', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (323, '豫G-I5B04', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (324, '豫J-M4N22', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (325, '豫J-U1E81', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (326, '豫O-B4R10', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (327, '豫O-G8G61', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (328, '豫O-K7M02', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (329, '豫R-R6O68', 'truck');
INSERT INTO rentcar.all_car (id, vehicle_id, type) VALUES (330, '豫Y-V0G53', 'truck');