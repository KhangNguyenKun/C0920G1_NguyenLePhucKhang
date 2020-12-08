use furamadatabase;
select * from nhanvien where (nhanvien.HoTen like'K%' or 'H%' or 'T%') and length(nhanvien.HoTen <=15) ;

select * from khachhang where
khachhang.DiaChi like '%Da Nang%' or '%Quang Tri%';

