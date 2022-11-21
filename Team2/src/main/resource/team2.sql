create database team2
go
use team2
go

--DoanhThu
if object_id ('DoanhThu') is not null
	drop table DoanhThu
go
create table DoanhThu
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	doanhThu decimal(20,0) default 0,
	--tienLai decimal(20,0) default 0,
	idCH uniqueidentifier foreign key (idCH) references CuaHang(id)
)

--CuaHang
if object_id ('CuaHang') is not null
	drop table CuaHang
go
create table CuaHang
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(20) default null,
	diaChi nvarchar(99) default null,
	thanhPho nvarchar(25) default null,
)
INSERT [dbo].[CuaHang] ([ma], [ten], diaChi, thanhPho) VALUES ( N'CH1', N'Winmart+', N'36 Xuân Phương', N'Hà Nội')
INSERT [dbo].[CuaHang] ([ma], [ten], diaChi, thanhPho) VALUES ( N'CH2', N'Lotte', N'37 Cầu Diễn', N'Hà Nội')
select * from CuaHang
--ChucVu
if object_id ('ChucVu') is not null
	drop table ChucVu
go
create table ChucVu
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(20) default null
)

INSERT [dbo].[ChucVu] ([Ma], [Ten]) VALUES (N'GÐ', N'Giám Đốc')
INSERT [dbo].[ChucVu] ([Ma], [Ten]) VALUES ( N'PP', N'Nhân Viên')
select * from ChucVu
--NhanVien
if object_id ('NhanVien') is not null
	drop table NhanVien
go
create table NhanVien
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ho nvarchar(15) default null,
	tenDem nvarchar(30) default null,
	ten nvarchar(15) default null,
	gioiTinh nvarchar(10) default null,
	diaChi nvarchar(99) default null,
	ngaySinh date default null,
	idCV uniqueidentifier foreign key (idCV) references ChucVu(id),
	idCH uniqueidentifier foreign key (idCH) references CuaHang(id),
	trangThai int default null
)
INSERT [dbo].[NhanVien] (ma, ho, tenDem, ten, gioiTinh, diaChi, ngaySinh, idCV, idCH, trangThai) VALUES
 (N'NV11',N'Vũ', N'Trí', N'Triều', N'Nam', N'Hà Nội', N'2003-3-3', N'2E43F01E-1802-4C33-9121-7A317BE69F5D', N'3EE90A0D-DF0E-41FE-94FB-3BF440E7B660', N'1')
 INSERT [dbo].[NhanVien] (ma, ho, tenDem, ten, gioiTinh, diaChi, ngaySinh, idCV, idCH, trangThai) VALUES
 (N'NV12',N'Nguyễn', N'Hữu', N'Hiếu', N'Nam', N'Hà Nội', N'2000-1-1', N'12743CDD-6A74-4E4D-811A-88FFCB3A108C', N'653CE673-3193-4BBD-B814-7193048C79A4', N'0')
 select * from NhanVien
--CaLamNhanVien
if object_id ('CaLam') is not null
	drop table CaLam
go
create table CaLam
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	thoiGianBatDau datetime,
	thoiGianKetThuc datetime,
	idNV uniqueidentifier foreign key (idNV) references NhanVien(id),
	trangThai int default null
)

--KhachHang
if object_id ('KhachHang') is not null
	drop table KhachHang
go
create table KhachHang
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ho nvarchar(15) default null,
	tenDem nvarchar(30) default null,
	ten nvarchar(15) default null,
	gioiTinh nvarchar(10) default null,
	diaChi nvarchar(99) default null,
	ngaySinh date default null,
	--trangThai nvarchar(20) default null
)

--SanPham
if object_id ('SanPham') is not null
	drop table SanPham
go
create table SanPham
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(30) default null
)
ALTER TABLE SanPham
  ADD anh nvarchar;

INSERT [dbo].[SanPham] ([ma], [ten]) VALUES ( N'SP1', N'Nike Air Force 1')
INSERT [dbo].[SanPham] ([ma], [ten]) VALUES ( N'SP2', N'adidas Ultraboost')
select * from SanPham

--MauSac
if object_id ('MauSac') is not null
	drop table MauSac
go
create table MauSac
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(30) default null
)
INSERT [dbo].[MauSac] ([Ma], [Ten]) VALUES ( N'WT', N'Trắng')
INSERT [dbo].[MauSac] ([Ma], [Ten]) VALUES ( N'BL', N'Đen')
select * from MauSac

-- NhaSanXuat
if object_id ('NSX') is not null
	drop table NSX
go
create table NSX
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(30) default null
)
INSERT [dbo].[NSX] ([ma], [ten]) VALUES ( N'NK', N'Nike')
INSERT [dbo].[NSX] ([ma], [ten]) VALUES ( N'AS', N'Adidas')
select * from NSX
--DongSanPham
if object_id ('DongSP') is not null
	drop table DongSP
go
create table DongSP
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(30) default null
)
INSERT [dbo].[DongSP] ([ma], [ten]) VALUES ( N'DSP1', N'Sneaker')
INSERT [dbo].[DongSP] ([ma], [ten]) VALUES ( N'DSP2', N'Chelsea boot')
select * from DongSP
--KhuyenMai
if object_id ('KhuyenMai') is not null
	drop table KhuyenMai
go
create table KhuyenMai
(
	id uniqueidentifier primary key default newid(),
	ma varchar(10) unique,
	ten nvarchar(30) default null,
	ngayBatDau date default null,
	ngayKetThuc date default null,
	phanTramGiam float default 0
)

--ChiTietSanPham
if object_id ('SPCT') is not null
	drop table SPCT
go
create table SPCT
(
	id uniqueidentifier primary key default newid(),
	idSP uniqueidentifier foreign key (idSP) references SanPham(id),
	idMS uniqueidentifier foreign key (idMS) references MauSac(id),
	idNSX uniqueidentifier foreign key (idNSX) references NSX(id),
	idDongSP uniqueidentifier foreign key (idDongSP) references DongSP(id),
	namBH int default null,
	soLuongCon int default 0,
	giaNhap decimal(20,0) default 0,
	giaBan decimal(20,0) default 0,
	moTa nvarchar(50) default null
)
INSERT [dbo].[SPCT] (idSP, idMS, idNSX, idDongSP, namBH, soLuongCon, giaNhap, giaBan, moTa)
 VALUES ( N'4292F67A-7F96-475E-A0B3-2D8C0D5CDE89', N'1942C072-E0DD-4E4B-B786-94655FDC2566',N'527A99F5-1B94-44FE-8CDB-F992D6399E55',
 N'0BB85445-FBA3-4C58-9F75-7EF6470C8877', 2024, 16,'800', '900', N'trẻ trung - năng động')
 INSERT [dbo].[SPCT] (idSP, idMS, idNSX, idDongSP, namBH, soLuongCon, giaNhap, giaBan, moTa)
 VALUES ( N'302C1CB7-9802-4EDB-988A-816C31551CD3', N'6D3527D5-EB0C-4CF3-BD45-BF40C7B9D044', N'132298D7-A393-45DE-BC81-C291E0BC033F',
 N'0BB85445-FBA3-4C58-9F75-7EF6470C8877', 2023, 23, '1000', '1200',N'Cao cấp')
 select * from SPCT


--HoaDon
if object_id ('HoaDon') is not null
	drop table HoaDon
go
create table HoaDon
(
	id uniqueidentifier primary key default newid(),
	idKH uniqueidentifier foreign key (idKH) references KhachHang(id),
	idNV uniqueidentifier foreign key (idNV) references NhanVien(id),
	idKM uniqueidentifier foreign key (idKM) references KhuyenMai(id),
	ma varchar(10) unique,
	ngayTao date default null,
	ngayThanhToan date default null,
	ngayMongMuonNhan date default null,
	ngayGui date default null,
	ngayNhan date default null,
	tinhTrang int default null,
	tenNguoiNhan nvarchar(50) default null,
	diaChi nvarchar(99) default null,
	sdt varchar(11) default null
)

--HoaDonChiTiet
if object_id ('HDCT') is not null
	drop table HDCT
go
create table HDCT
(
	idHD uniqueidentifier,
	idSPCT uniqueidentifier,
	soLuong int,
	donGia decimal(20,0) default 0,
	constraint PK_HDCT primary key (idHD, idSPCT),
	constraint FK1_HD foreign key (idHD) references HoaDon(id),
	constraint FK2_SPCT foreign key (idSPCT) references SPCT(id)
)

--BaoHanh
if object_id ('BaoHanh') is not null
	drop table BaoHanh
go
create table BaoHanh
(
	id uniqueidentifier primary key default newid(),
	idKH uniqueidentifier foreign key (idKH) references KhachHang(id),
	idHD uniqueidentifier foreign key (idHD) references HoaDon(id),
	ma varchar(10) unique,
	ngayBatDau date default null,
	ngayKetThuc date default null
)

--BaoHanhChiTiet
if object_id ('BHCT') is not null
	drop table BHCT
go
create table BHCT
(
	idBH uniqueidentifier,
	idSPCT uniqueidentifier,
	moTa nvarchar(99) default null,
	tinhTrang int default null,
	ngayMuaSP date,
	chiPhi decimal(20,0) default 0,
	constraint PK_BHCT primary key (idBH, idSPCT),
	constraint FK1_BH foreign key (idBH) references BaoHanh(id),
	constraint FK2_SPCT1 foreign key (idSPCT) references SPCT(id)
)
select * from BHCT

