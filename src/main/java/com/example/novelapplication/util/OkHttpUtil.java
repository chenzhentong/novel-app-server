package com.example.novelapplication.util;

import java.io.IOException;

import com.example.novelapplication.model.Book;
import com.example.novelapplication.model.BookList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtil {

	public static void sendOkHttpRequest(String address, Callback callback) {

		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(address).build();
		client.newCall(request).enqueue(callback);

	}

	public static void main(String[] args) {
		sendOkHttpRequest(
	"https://api.zhuishushenqi.com/book/by-categories?gender=male&type=hot&major=%E5%A5%87%E5%B9%BB&minor=&start=0&limit=20",
                new Callback(){

			 @Override
	            public void onFailure(Call call, IOException e) {
	            }
	            @Override
	            public void onResponse(Call call, Response response) throws IOException {
	                String responseData=response.body().string();
	              
	                Gson gson=new Gson();
	                BookList bookList=gson.fromJson(responseData,new TypeToken<BookList>(){}.getType());
	                //Log.d("MainActivity",bookList.toString());
	                for (Book book:bookList.getBooks()){
	                    System.out.println("book:"+book.toString());
	                }
	            }
	           });
	       }



		

}
