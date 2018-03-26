package android.app.swift.sdk;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * 接口提供程序
 * Created by ChenRui on 2018/3/26 0026 14:13.
 */
public abstract class SdkProvider {

    protected Retrofit mRetrofit;

    public SdkProvider(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

//    /**
//     * 创建请求客户端
//     */
//    protected OkHttpClient createOkHttpClient() {
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.
//        return builder.build();
//    }

    protected Retrofit createRetrofit(String baseUrl) {
        return new Retrofit.Builder()
                .client(httpClient)
                .baseUrl(ApiConstant.API_BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

}
