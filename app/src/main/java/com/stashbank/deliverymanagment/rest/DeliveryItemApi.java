package com.stashbank.deliverymanagment.rest;

import java.util.List;
import retrofit2.*;
import retrofit2.http.*;
import com.stashbank.deliverymanagment.models.*;

public interface DeliveryItemApi
{
	@GET("delivery_manegment.delivery")
	Call<List<DeliveryItem>> getItems();
	
	@GET("delivery_manegment.delivery/{id}")
	Call<DeliveryItem> getItemById(@Path("id") String id);	
	
	@PUT("delivery_manegment.delivery/{id}")
	Call<DeliveryItem> setItem(@Path("id") String id, @Body DeliveryItem item);
	
	@FormUrlEncoded
	@PUT("delivery_manegment.delivery/{id}")
<<<<<<< HEAD
	Call<DeliveryItem> markPayment(@Path("id") String id, @Field("payed") boolean payed);
=======
	Call<DeliveryItem> markPayment(@Path("id") String id, @Field boolean payed);
>>>>>>> master
}