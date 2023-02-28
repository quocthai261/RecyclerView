package com.example.bt3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private WordViewHolder mViewHolder;
    private LinkedList<NewsView> mNewsList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewsList.add(new NewsView(R.drawable.hwm50p, "Huawei Mate 50 Pro hiệu năng thực tế như thế nào?", "Huawei Mate 50 Pro với hiệu năng cực kỳ ấn tượng", "Huawei Mate 50 Pro mang lại trải nghiệm cho người dùng vô cùng tuyệt vời"));
        mNewsList.add(new NewsView(R.drawable.hwp50p, "Google ngừng hỗ trợ Android trên điện thoại Huawei", "Google phát lệnh cấm Huawei khỏi một số bản cập nhật cho hệ điều hành Android", "Google ngừng hợp tác với Huawei, điện thoại hãng này sẽ không được cập nhật Android, không vào được YouTube và Gmail"));
        mNewsList.add(new NewsView(R.drawable.ip13, "Iphone 13 giảm giá mạnh", "Vào ngày 28/2/2023 giá Iphone 13 giảm không phanh", "Vào ngày 28/2/2023 giá Iphone 13 giảm không phanh chỉ còn một nửa so với lúc vừa ra mắt."));
        mNewsList.add(new NewsView(R.drawable.ip14, "Apple ra mắt Iphone 14", "Iphone 14 chính thức được ra mắt đầu tháng 4/2023", "Iphone 14 chính thức được ra mắt đầu tháng 4/2023, theo dự định giá khởi điểm sẽ là 990$."));
        mNewsList.add(new NewsView(R.drawable.oppo, "Oppo Reno 9 với cấu hình khủng đã chính thức ra mắt", "Hiệu năng của Oppo Reno 9", "Reno 9 được trang bị màn hình AMOLED 6,7 inch với độ phân giải Full HD+. Màn hình hỗ trợ tốc độ làm mới 120Hz và tốc độ lấy mẫu cảm ứng 240Hz. Đồng thời, màn hình 10 bit còn có độ bao phủ gam màu 100% DCI-P3 và đạt độ sáng lên tới 800 nit ở chế độ thông thường và lên đến 950 nit khi hiển thị nội dung HDR và nội dung video HDR10+"));
        mNewsList.add(new NewsView(R.drawable.realme9, "Realme 9 sẽ là bản nâng cấp của Realme 8", "Realme 9 đang rục rịch ra mắt", "Realme 9 đang rục rịch ra mắt người tiêu dùng với thiết kế hoàn toàn mới và độc lạ"));
        mNewsList.add(new NewsView(R.drawable.sss23, "Samsung xác nhận ngày ra mắt Galaxy S23", "Ngày ra mắt chính thức của Galaxy S23 series", "Samsung thường mất khoảng hai tuần từ sự kiện công bố đến khi sản phẩm lên kệ. Với S23, hãng nhiều khả năng bắt đầu bán vào ngày 10/2 hoặc 17/2."));
        mNewsList.add(new NewsView(R.drawable.sss23u,"Trải nghiệm camera trên S23 Ultra", "Camera trên S23 Ultra có những cải tiến gì?", "Camera của Galaxy S23 Ultra mạnh về chụp thiếu sáng và chụp xa, cải thiện màu sắc, độ chi tiết và dynamic range."));

        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mNewsList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}