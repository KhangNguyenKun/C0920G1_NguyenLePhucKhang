	use furamadatabase;
    
    insert into vitri(IDViTri , TenViTri) values
     (1, 'Boss1'),
     (2, 'Boss2');
     
     insert into vitri(IDViTri , TenViTri) values
     (3, 'Boss2');
     
--      (4, 'Boss2'),
--      (5, 'Boss2'),
--      (6, 'Boss2'),
--      (7, 'Boss2'),
--      (8, 'Boss2'),
--      (9, 'Boss2'),
--      (10, 'Boss2'),
--      (11, 'Boss2'),
--      (12, 'Boss2'),
--      (13, 'Boss2'),
--      (14, 'Boss2');
     insert into trinhdo(IDTrinhDo, TrinhDo) values 
     (1, 'daihoc'),
	 (2, 'caodang');
     insert into bophan(IDBoPhan, TenBoPhan) values
     (1, 'bophan1'),
     (2, 'bophan2');
     insert into DichVuDiKem
      values
(1,'massage',300000,1,'ok'),
 (2,'karaoke', 120000,1,'ok'),
 (3,'food',50000,1,'ok'),
 (4, 'water', 20000,1,'ok'),
 ( 5, 'Rent Car', 1200000, 1, 'ok');
     insert into loaikhach (idloaikhach, tenloaikhach) values
     (1, 'vip'),
     (2, 'normal'),
     (3, 'premieum'),
     (4, 'business');
     insert into kieuthue( idkieuthue, tenkieuthue, gia) values
     (1, 'nganngay', 120),
     (2, 'daingay', 120),
     (3, '1ngay', 120),
     (4, '1dem', 120);
     insert into loaidichvu(idloaidichvu, tenloaidichvu) values 
     (1, 'resort'),
     (2, 'room'),
     (3, 'house');
     insert into khachhang values
(1,1,'Tuan','1995/11/16','232132322', '092312312','tuan@gmail.com','Da Nang'),
(2,2,'Bao','1997/08/09','232132322', '092312312','bao@gmail.com','Quang Tri'),
(3,3,'Khang','1998/03/13','232132322', '092312312','khang@gmail.com','Quang Nam'),
(4,4,'Trang','1997/11/20','232132322', '092312312','trang@gmail.com','Quang Nam');
-- (5,4,'Anh','1995/04/29','232132322', '092312312','anh@gmail.com','Hai Phong'),
-- (6,5,'Hung','2000/07/06','232132322', '092312312','hung@gmail.com','Quang Binh'),
-- (7,1,'Phuc','1997/12/06','232132322', '092312312','phuc@gmail.com','Quang Tri');

insert into NhanVien
values
(1,'Nguyen Van Phuc', 3 , 2, 2, '1986/09/30', '1232132323', '50000000', '091231212','phucnguyen@gmail.com','Da Nang'),
(2,'Nguyen Van Hoa', 3 , 2, 2, '1986/09/30', '1232132323', '3000000', '091231212','phucnguyen@gmail.com','Quang Tri'),
(3,'Nguyen Van Khang', 2 , 2, 2, '1986/09/30', '1232132323', '700000', '091231212','phucnguyen@gmail.com','Quang Binh'),
(4, 'Nguyen Van Anh', 1 , 1, 2, '1986/09/30', '1232132323', '700000', '091231212','phucnguyen@gmail.com','Quang Binh'),
(5, 'Nguyen Van Phuc', 2 , 2, 2, '1986/09/30', '1232132323', '800000', '091231212','phucnguyen@gmail.com','Da Nang'),
(6,'Nguyen Van Khanh', 3 , 1, 2, '1986/09/30', '1232132323', '1000000', '091231212','phucnguyen@gmail.com','Quang Nam'),
(7,'Nguyen Van Phuc', 1 , 2, 2, '1986/09/30', '1232132323', '18000000', '091231212','phucnguyen@gmail.com','Quang Tri'),
(8,'Nguyen Van Phuc', 3 , 1, 2, '1986/09/30', '1232132323', '5000000', '091231212','phucnguyen@gmail.com','Da Nang'),
(9,'Nguyen Van Tuan', 1, 2, 2, '1986/09/30', '1232132323', '6000000', '091231212','phucnguyen@gmail.com','Quang Nam'),
(10,'Nguyen Van Kha', 2 ,2, 2, '1986/09/30', '1232132323', '7500000', '091231212','phucnguyen@gmail.com','Da Nang'),
(11,'Nguyen Van Phuc', 2 , 2, 2, '1986/09/30', '1232132323', '9500000', '091231212','phucnguyen@gmail.com','Quang Tri'),
(12,'Nguyen Van Sang', 2 , 1, 2, '1986/09/30', '1232132323', '12000000', '091231212','phucnguyen@gmail.com','Da Nang'),
(13,'Nguyen Van Vy', 1 , 1, 2, '1986/09/30', '1232132323', '5000000', '091231212','phucnguyen@gmail.com','Quang Nam'),
(14,'Nguyen Thi Anh', 2 , 2, 2, '1986/09/30', '1232132323', '5000000', '091231212','phucnguyen@gmail.com','Quang Nam');

insert into DichVu
values
(1, 'Villa', 250, 3, '14', '5000000', 1 , 1, 'ok'),
(2, 'House', 180, 4, '15', '2000000', 2 , 2,'ok'),
(3, 'Room', 60, 1, '5', '1000000', 4 , 3,'ok'),
(4, 'Room', 60, 1, '5', '1000000', 3 , 3,'ok');

insert into HopDong
values
(4, 1 , 1, 2 , '2020/12/03', '2021/04/03', 10000000, 123123121),
(5, 2 , 2, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(6, 9 , 3, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(7, 4 , 4, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(8, 10 , 1, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(9, 12 , 2, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(10 ,3 , 3, 1 , '2020/02/03', '2021/02/03', 10000000, 123123121);

insert into HopDongChiTiet
values
(1, 2, 5, 5),
(2, 3, 4, 7),
(3, 1, 1, 9),
(4, 1, 3, 11);