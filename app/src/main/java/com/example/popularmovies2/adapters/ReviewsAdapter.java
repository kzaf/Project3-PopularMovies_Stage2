package com.example.popularmovies2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.popularmovies2.R;
import com.example.popularmovies2.models.Review;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder> {

    private Review[] mReviewsArray;
    private TextView mAuthor;
    private TextView mContext;

    public ReviewsAdapter(Review[] numberOfReviews) {
        this.mReviewsArray = numberOfReviews;
    }

    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.review_list_item_for_recyclerview, viewGroup, false);

        return new ReviewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewHolder reviewsViewHolder, int position) {
            mAuthor.setText(mReviewsArray[position].getAuthor() + ":");
            mContext.setText(mReviewsArray[position].getContent());
    }

    @Override
    public int getItemCount() {
        if (null == mReviewsArray) return 0;
        return mReviewsArray.length;
    }

    public class ReviewsViewHolder extends RecyclerView.ViewHolder{

        private ReviewsViewHolder(@NonNull View itemView) {
            super(itemView);
            mAuthor = itemView.findViewById(R.id.iv_author);
            mContext = itemView.findViewById(R.id.iv_context);
        }

    }



}
