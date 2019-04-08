package com.prasad.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.prasad.book.adapter.AuthorBookAdapter;
import com.prasad.book.adapter.HeaderBookAdapter;
import com.prasad.book.adapter.NewArrivedBookAdapter;
import com.prasad.book.adapter.NewBookExtraAdapter;
import com.prasad.book.model.AuthorModel;
import com.prasad.book.model.NewBookModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.recyclerViewHeader)
    RecyclerView recyclerViewHeader;

    @BindView(R.id.recyclerAuthor)
    RecyclerView recyclerAuthor;

    @BindView(R.id.recyclerNewBook)
    RecyclerView recyclerNewBook;

    @BindView(R.id.recyclerNewBookExtra)
    RecyclerView recyclerNewBookExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        onHeaderRecycler();
        onAuthorRecycler();
        onNewBookRecycler();
        onNewBookExtraRecycler();


    }


    private void onNewBookExtraRecycler() {
        recyclerNewBookExtra.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        recyclerNewBookExtra.setAdapter(new NewBookExtraAdapter(this));
    }

    private void onNewBookRecycler() {
        List<NewBookModel> data = new ArrayList<>();
        data.add(new NewBookModel(R.drawable.book_model,"The Alchemist","Paulo Coelho"));
        data.add(new NewBookModel(R.drawable.book_two,"Converssation with","Sally Rooney"));
        data.add(new NewBookModel(R.drawable.book_three,"This Is How It Always Is","Laurie Frankel"));

        recyclerNewBook.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        recyclerNewBook.setAdapter(new NewArrivedBookAdapter(this,data));
    }

    public void onHeaderRecycler() {
        recyclerViewHeader.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        recyclerViewHeader.setAdapter(new HeaderBookAdapter(this));
    }

    private void onAuthorRecycler() {
        List<AuthorModel> data = new ArrayList<>();
        data.add(new AuthorModel(R.drawable.avatar_1,"Firdausi"));
        data.add(new AuthorModel(R.drawable.avatar_2,"Zamba"));
        data.add(new AuthorModel(R.drawable.avatar_3,"Angelina"));
        data.add(new AuthorModel(R.drawable.avatar_4,"Luke"));
        data.add(new AuthorModel(R.drawable.avatar_5,"Hanna"));
        data.add(new AuthorModel(R.drawable.avatar_6,"Julie"));
        data.add(new AuthorModel(R.drawable.default_avatar,"Jenifer"));

        recyclerAuthor.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        recyclerAuthor.setAdapter(new AuthorBookAdapter(this,data));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.shopping) {
            Intent intent = new Intent(getApplicationContext(),BookDetailsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
