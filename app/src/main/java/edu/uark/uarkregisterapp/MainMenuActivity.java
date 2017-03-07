package edu.uark.uarkregisterapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.uark.uarkregisterapp.models.transition.ProductTransition;

public class MainMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void displayAllProductsButtonOnClick(View view) {
        this.startActivity(new Intent(getApplicationContext(), ProductsListingActivity.class));
    }

    public void createProductButtonOnClick(View view) {
        Intent intent = new Intent(getApplicationContext(), ProductViewActivity.class);

        intent.putExtra(
                getString(R.string.intent_extra_product),
                new ProductTransition()
        );

        this.startActivity(intent);
    }
}
