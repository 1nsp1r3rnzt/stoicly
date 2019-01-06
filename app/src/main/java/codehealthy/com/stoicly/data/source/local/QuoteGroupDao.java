package codehealthy.com.stoicly.data.source.local;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import codehealthy.com.stoicly.data.model.QuoteGroup;

@Dao
public interface QuoteGroupDao {

    @Query("SELECT * FROM QuoteGroup")
    LiveData<List<QuoteGroup>> getAllQuoteGroup();


    @Query("SELECT * from QuoteGroup where group_category = :categoryId")
    List<QuoteGroup> getQuoteGroupByCategoryId(int categoryId);

    @Update
    void updateQuoteGroup(QuoteGroup... quoteGroup);

    @Insert
    void createQuoteGroup(QuoteGroup quoteGroups);

    @Delete
    void deleteQuoteGroup(QuoteGroup quoteGroup);


}
