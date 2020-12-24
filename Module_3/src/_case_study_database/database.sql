drop database if exists furamadatabase;
create database furamadatabase ;

use furamadatabase;

create table ViTri (
IDViTri INT primary key, 
tenViTri varchar(45));

create table TrinhDo (
IDTrinhDo int primary key, 
TrinhDo varchar(45));

create table BoPhan (
IDBoPhan int primary key,
TenBoPhan varchar(45));



create table DichVuDiKem (
IDDichVuDiKem int primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45));

create table LoaiKhach(
IDLoaiKhach int primary key,
TenLoaiKhach varchar(45));

create table KhachHang(
IDKhachHang int primary key,
IDLoaiKhach int,
foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach),
HoTen varchar(45),
NgaySinh varchar(45),
SoCMTND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45));

create table KieuThue(
IDKieuThue int primary key,
TenKieuThue varchar(45),
Gia int);

create table LoaiDichVu(
IDLoaiDichVu int primary key,
TenLoaiDichVu varchar(45));

create table DichVu(
IDDichVu int primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue int,
foreign key (IDKieuThue) references KieuThue(IDKieuThue),
IDLoaiDichVu int,
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu),
TrangThai varchar(45));



create table NhanVien(
IDNhanVien int primary key,
HoTen varchar(45),
IDViTri int,
foreign key (IDViTri) references ViTri(IDViTri) on update cascade,
IDTrinhDo int,
foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo)  on update cascade,
IDBoPhan int,
foreign key (IDBoPhan) references BoPhan(IDBoPhan)  on update cascade,
NgaySinh date,
SoCMTND varchar(45),
luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45));



create table HopDong (
IDHopDong int primary key,
IDNhanVien int,
foreign key (IDNhanVien) references nhanvien(IDNhanVien),
IDKhachHang int,
foreign key (IDKhachHang) references KhachHang(IDKhachHang),
IDDichVu int,
foreign key (IDDichVu) references DichVu(IDDichVu),
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int);

create table HopDongChiTiet (
IDHopDongChiTiet int primary key,
IDHopDong int,
foreign key (IDHopDong) references HopDong(IDHopDong),
IDDichVuDiKem int,
foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem),
SoLuong INT);