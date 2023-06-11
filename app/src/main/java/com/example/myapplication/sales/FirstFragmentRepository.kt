package com.example.myapplication.sales

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.apiutils.ApiClient
import com.example.myapplication.apiutils.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragmentRepository(private val context: Context) {
    val allCategories = MutableLiveData<ContactModel?>()
    private val apiClient: ApiClient = ApiClient(context)

    init {
        allCategoriesSubCategories
    }//Helper.cancelLoader();// Helper.cancelLoader();//Helper.cancelLoader();//Helper.cancelLoader();

    // Helper.showLoader(context, "");
    private val allCategoriesSubCategories: Unit
        private get() {

            // Helper.showLoader(context, "");
            val apiInterface = apiClient.client!!.create(ApiInterface::class.java)
            val getCall = apiInterface.getContact
            getCall!!.enqueue(object : Callback<ContactModel?> {
                override fun onResponse(
                    call: Call<ContactModel?>,
                    response: Response<ContactModel?>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            allCategories.setValue(response.body())
                            //Helper.cancelLoader();
                        } else {
                            //Helper.cancelLoader();
                        }
                    } else {
                        // Helper.cancelLoader();
                    }
                }

                override fun onFailure(call: Call<ContactModel?>, t: Throwable) {
                    //Helper.cancelLoader();
                }
            })
        }
}