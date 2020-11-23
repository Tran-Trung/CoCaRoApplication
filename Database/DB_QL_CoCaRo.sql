/* ==============================================================================

ĐỀ TÀI 2: XÂY DỰNG CHƯƠNG TRÌNH CHƠI CỜ CARO

Yêu cầu về chức năng phía client (phải có GUI):

 Đăng ký tài khoản mới, đăng nhập, cập nhật thông tin tài khoản tương tự đề tài 1 (loại trừ
phần xác thực email).

 Chức năng chơi game:

 Cứ một cặp user đăng nhập sẽ được ghép đôi thành 1 phiên chơi sau khi có xác nhận
đồng ý từ cả hai user.

 Nếu 1 user đăng nhập vào trường hợp lẻ, user sẽ được đưa vào hàng đợi và có thể chọn
xem 1 phiên chơi của một cặp bất kỳ. User này sẽ tự động được ghép đôi tạo thành 1
phiên chơi mới khi có một user nữa đăng nhập (cần có xác nhận đồng ý từ cả hai user).
Trong trường hợp một trong hai user không đồng ý ghép đôi, cả hai sẽ được đưa lại vào
hàng đợi và user từ chối ghép đôi sẽ bị trừ 1 điểm thành tích.

 Mỗi phiên chơi giới hạn trong 10 phút, nếu hết thời gian thì xem như 2 user hòa. Thời
gian giới hạn cho mỗi nước đi là 30 giây, user nào không đi nước mới trong thời gian
giới hạn sẽ bị xử thua. Điểm phiên chơi được tính theo tỉ lệ:

 Thắng: cộng 3 điểm.

 Hòa: cộng 1 điểm.

 Thua: trừ 1 điểm.


 Chat nhóm trong khi chơi: giữa người chơi 1 – người chơi 2 – người xem.

 Xem thành tích cá nhân: số trận thắng/thua, tỉ lệ thắng, chuỗi trận thắng/thua dài nhất, điểm
thành tích (nhóm tự xác định công thức tính điểm thành tích sao cho hợp lý).

 Xếp hạng: liệt kê thứ hạng tất cả các user đã tham gia dựa trên điểm thành tích; chuỗi trận
thắng; tỉ lệ thắng (cần quan tâm đến trường hợp user mới tham gia vài trận).
Yêu cầu về chức năng phía server (không cần GUI):

 Thống kê được tổng số user, số user đang online.

 Block user khỏi hệ thống.

 Ghi log các trận đấu (các user tham gia, thời gian chơi, thời gian bắt đầu, ....) và query được các
thông tin cơ bản (user thắng nhiều nhất, trận đấu ngắn nhất,...).
Yêu cầu chung:

 Mã hóa nội dung trao đổi giữa client – server. Phải sử dụng key khác nhau cho các client.

 Các client phải chạy trên các máy tính khác nhau.

==============================================================================



Tính năng:

Server:
	Khởi chạy
	tạo array lobby
	Nếu client kết nối
		Kiểm tra đăng nhập
		Ráp cặp với từng người trong lobby và chờ phản hồi
			Từ chối => trừ thành tích ng đó và kiểm tra ng tiếp theo trong lobby
			Đồng ý => Tạo trận đấu
		Nếu hàng đợi hết ng thì thông báo chờ và xuất ds các trận đấu hiện tại

	Trận đâu (duyệt 1 lượt qua các trận đấu)

		Gửi đến các client đếm ngược 5 giây
		
		Lượt ng 1
			Khóa input ng 2 (trừ chat)
			chờ 30 giây
				nhận x, y ng 1 và chuyển lượt 2
				quá 30s, kết thúc trận đấu với kết quả ng 2 thắng
			Nhận chat từ client

		Lượt ng 2 tương tự lượt 1 với ng 2

		Sau mội lượt, gửi

		UPDATE*
			kiểm tra kết nối client (mất kết nối = thua)
			kiểm tra điều kiện thắng (5 ô thẳng liên tiếp)
			kiểm tra thời gian trận đấu - 10 phút / trận (quá giờ = hòa)
			kiểm tra thời gian lượt - 30 giay / lượt (quá giờ = thua)

			Gửi các thông tin sau đến các client:
			kết quả diễn biến (matrận caro)
			lượt ng chơi
			thời gian 1 lượt
			thời gian trận đấu
			chat mess cho các client

		Kết quả
			thông báo kết quả đến các client
			cộng trừ điểm thành tích và lưu database
				win +3
				draw +1
				lost -1
			đưa ng chơi về phòng chờ

Client:
	Đăng ký
	Đăng nhập
	Thay đổi thông tin tài khoản

	Phòng chờ
		Nhận danh sách trận đấu
		Chọn xem trận đấu khác với danh sách trận đấu
		Chọn tìm trận và đợi máy chủ ghép và ng khác đồng ý (có thể hủy về lobby)
		Chờ, nếu nhận thông báo thách đấu có thể đồng ý hoặc từ chối

	Vào trận
		Chờ hết thời gian đếm ngược 5 giây
		Chat mess tự do
		Chờ đến lượt
		Chọn vị trí

		Hiển thị:
		thời gian trận đấu
		lượt ng chơi
		thời gian lượt
		ma trận diễn biến
		chat mess

		Có thông báo kết quả, về phòng chờ

	Xem trận
		Chờ hết thời gian đếm ngược 5 giây
		Chat mess tự do

		Hiển thị:
		thời gian trận đấu
		lượt ng chơi
		thời gian lượt
		ma trận diễn biến
		chat mess

	Tra cứu xếp hạng
		Theo điểm thành tích
		Theo chuỗi trận thắng
		Theo tỉ lệ thắng

	Thoát game

==============================================================================
*/

CREATE DATABASE DB_QL_CoCaRo

GO
USE DB_QL_CoCaRo

CREATE TABLE NGUOICHOI (
	ID			int	primary key,
	TAIKHOAN	varchar(100) NOT NULL,
	MATKHAU		varchar(100) NOT NULL,
	EMAIL		varchar(100) NOT NULL,
	DIENTHOAI	char(10),
	THANHTICH	int		DEFAULT 0,
	THANG		int		DEFAULT 0,
	THUA		int		DEFAULT 0,
	CHUOITHANG	int		DEFAULT 0,
	CHUOITHUA	int		DEFAULT 0,
	LOCK		int		DEFAULT 0,
)
CREATE TABLE TRANDAU (
	IDTD	int	primary key,
	ROOM	varchar(64)	NOT NULL,
	ID1		int,
	ID2		int,
	KETQUA	int DEFAULT 0,
	TGCHOI	datetime,
	TGBATDAU	datetime,
	CONSTRAINT CHK_TD_KQ CHECK (KETQUA>=0 AND KETQUA<=3),
	CONSTRAINT FK_TD_NC1 FOREIGN KEY (ID1) REFERENCES NGUOICHOI(ID),
	CONSTRAINT FK_TD_NC2 FOREIGN KEY (ID2) REFERENCES NGUOICHOI(ID),
)
-- KETQUA theo: 0: chưa có kết quả, 1: ng 1 thắng, 2: ng 2 thắng, 3: hòa
-- Add values into NGUOICHOI
	--INSERT INTO NGUOICHOI VALUES (1, 'Tran Trung', '123456', 'tranq.trung.99@gmail.com', '0963059318', 0, 0, 0, 0, 0, 0)
	--INSERT INTO NGUOICHOI VALUES (2, 'Chi Trung', '123456', 'ngoc.trung.99@gmail.com', '0963059318', 0, 0, 0, 0, 0, 0)
	SELECT * FROM NGUOICHOI
--Drop database DB_QL_CoCaRo