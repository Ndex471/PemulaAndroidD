package com.gunawan.pemulaandroidd;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gunawan.pemulaandroidd.model.DataKlub;
import com.gunawan.pemulaandroidd.model.Klub;

import java.util.ArrayList;
import java.util.List;

public class HalamanUtamaActivity extends AppCompatActivity implements DataKlub.KlubClickListener {
    public static final String Key_HalamanUtamaActivity="Key_HalamanUtamaActivity";

    public RecyclerView rv;
    public DataKlub dataKlub;
    public RecyclerView.LayoutManager layoutManager;
    public List<Klub> listKlub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        rv = findViewById(R.id.rvKlub);
        listKlub.add(new Klub("Liverpool FC",
                "Peringkat 1 sementara EPL hingga pekan ke-8 dengan 24 poin",
                "https://seeklogo.com/images/L/liverpool-fc-logo-0EB18C45CF-seeklogo.com.png",
                "Liverpool FC adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. " +
                        "Liverpool juga merupakan juara bertahan Liga Champions UEFA musim 2018-2019. Liverpool telah memenangkan 6 trofi Liga Champions UEFA " +
                        "(dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah " +
                        "Real Madrid dan AC Milan. Selain itu Liverpoo l juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA."));
        listKlub.add(new Klub("Manchester City FC",
                "Peringkat 2 sementara EPL hingga pekan ke-8 dengan 16 poin",
                "https://clipart.info/images/ccovers/1503438204manchester-city-new-football-logo-png.png",
                "Manchester City FC adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan " +
                        "Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880. Pada saat itu masih bernama " +
                        "St Mark's (West Gorton). Pada tahun 1887 berubah nama menjadi Ardwick A.F.C, dan pada tahun 1894 menjadi Manchester City F.C."));
        listKlub.add(new Klub("Arsenal FC",
                "Peringkat 3 sementara EPL hingga pekan ke-8 dengan 15 poin",
                "https://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4df.png",
                "Arsenal FC adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini " +
                        "bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris " +
                        "(10 pada era Divisi Pertama dan 3 pada era Premier League) dan 13 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode " +
                        "terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen " +
                        "Liga Inggris sepanjang abad ke-20. Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan " +
                        "tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan."));
        listKlub.add(new Klub("Leicester City FC",
                "Peringkat 4 sementara EPL hingga pekan ke-8 dengan 14 poin",
                "https://upload.wikimedia.org/wikipedia/hif/a/ab/Leicester_City_crest.png",
                "Leicester City FC adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan " +
                        "pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton. Mereka bermain di Liga Premier, setelah promosi sebagai juara " +
                        "Football League Championship di 2013-14, kembali ke papan atas sepak bola Inggris setelah satu dekade dan akhirnya menjadi juara di musim 2015-16, " +
                        "atau dua musim setelah promosi."));
        listKlub.add(new Klub("Chelsea FC",
                "Peringkat 5 sementara EPL hingga pekan ke-8 dengan 14 poin",
                "https://upload.wikimedia.org/wikipedia/hif/0/0d/Chelsea_FC.png",
                "Chelsea FC adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama " +
                        "Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih " +
                        "pada dekade 1960an, 1970an, 1990an, dan 2000an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam " +
                        "gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, satu Liga Champions UEFA, dan satu " +
                        "Piala Super UEFA. Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lebih dari 30 gelar sejak tahun 1997, termasuk " +
                        "untuk pertama kali meraih gelar ganda, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan Liga " +
                        "Eropa UEFA pada 2013 dan 2019."));
        listKlub.add(new Klub("Crystal Palace FC",
                "Peringkat 6 sementara EPL hingga pekan ke-8 dengan 14 poin",
                "https://seeklogo.net/wp-content/uploads/2015/07/crystal-palace-fc-logo-vector-download.jpg",
                "Crystal Palace FC merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905. Klub ini memainkan " +
                        "pertandingan kandangnya di Selhurst Park yang berkapasitas 26.309 penonton. Seragam mereka berwarna merah-biru. Musim 2012-13 klub ini bermain di " +
                        "Liga Championship Inggris. Mulai musim 2013-14, klub akan bermain di Liga Utama Inggris setelah mendapatkan promosi karena menjadi juara dalam " +
                        "pertandingan final play-off Liga Championship Inggris, dengan mengalahkan Watford yang berlangsung di Stadion Wembley."));
        listKlub.add(new Klub("Burnley FC",
                "Peringkat 7 sementara EPL hingga pekan ke-8 dengan 12 poin",
                "https://cdn.shopify.com/s/files/1/1888/7339/articles/H_Burnley_bd585570-468d-4a67-b0a0-cd21f05b1918_1024x1024.png?v=1499087884",
                "Burnley FC adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris, kasta tertinggi " +
                        "sepak bola inggris di musim 2016-17 setelah memenangkan liga peringkat kedua yaitu Liga Championship Inggris di musim sebelumnya. Klub ini memainkan " +
                        "pertandingan kandangnya di stadion Turf Moor yang berkapasitas 22.546 penonton. Seragam mereka adalah berwarna nila, sehingga mereka dijuluki Clarets. " +
                        "Klub ini adalah salah satu anggota penemu English Football League pada tahun 1888. Burnley pernah dua kali menjadi juara Liga Inggris Divisi Pertama, " +
                        "di musim 1920–21 dan 1959–60, pernah memenangkan Piala FA sekali, pada tahun 1914, dan pernah memenangkan Community Shield dua kali, di 1960 dan 1973."));
        listKlub.add(new Klub("West Ham United FC",
                "Peringkat 8 sementara EPL hingga pekan ke-8 dengan 12 poin",
                "https://cdn2.tstatic.net/tribunnews/foto/bank/images/west-ham-united-lgo_20150702_144025.jpg",
                "West Ham United FC adalah sebuah klub sepak bola Inggris yang bermarkas di London. Sejak 2016, klub ini memainkan pertandingan kandangnya di London " +
                        "Stadium yang berkapasitas 80.000 kursi. Sebelumnya Hammers bermain di Boleyn Ground. Seragam mereka berwarna merah-biru."));
        listKlub.add(new Klub("Tottenham Hotspur FC",
                "Peringkat 9 sementara EPL hingga pekan ke-8 dengan 11 poin",
                "https://seeklogo.net/wp-content/uploads/2014/10/tottenham-hotspur-fc-logo.png",
                "Tottenham Hotspur FC adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai " +
                        "Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih." +
                        "Didirikan pada tahun 1882, Tottenham memenangkan Piala FA untuk pertama kalinya pada tahun 1901, dan menjadi satu-satunya klub non-Liga yang menjuarai " +
                        "Piala FA, sejak dibentuknya The Football League. Pada musim 1960-61, Tottenham adalah klub pertama pada abad ke-20 yang meraih gelar ganda sebagai " +
                        "juara Liga dan Piala FA. Setelah berhasil mempertahankan Piala FA pada tahun 1962, Tottenham menjadi klub Inggris pertama yang memenangkan kompetisi " +
                        "klub UEFA dengan menjadi juara Piala Winners UEFA pada tahun 1963. Piala FA yang ketiga kalinya pada tahun 1960-an, dimenangkan pada tahun 1967."));
        listKlub.add(new Klub("AFC Bournemouth",
                "Peringkat 10 sementara EPL hingga pekan ke-8 dengan 11 poin",
                "https://1000logos.net/wp-content/uploads/2018/06/AFC-Bournemouth-Logo.png",
                "AFC Bournemouth merupakan sebuah klub sepak bola profesional asal Inggris yang saat ini bermain di Liga Primer Inggris. Klub ini bermain di Lapangan " +
                        "Dean Court di Kings Park, Boscombe, Bournemouth, Dorset dan sudah ada sejak tahun 1899. Awalnya klub ini pada saat didirikan pada tahun 1890 bernama " +
                        "Boscombe St. John's Institute FC tetapi dibubarkan pada tahun 1899 dan didirikan ulang pada tahun 1899 dengan nama Boscombe FC. Klub ini sudah " +
                        "memenangkan tingkatan ke-dua dan ke-tiga Liga Inggris, dan pernah menjadi juara tingkatan ke-empat sebanyak dua kali. Mereka juga pernah memenangkan " +
                        "Liga Selatan Inggris, Trofi Liga Inggris, dan juga Piala Sepak Bola Disisi Ketiga Selatan. Di bawah manajemen Eddie Howe, A.F.C. Bournemouth promosi " +
                        "ke Liga Utama Inggris untuk pertama kalinya di musim 2015–16."));
        listKlub.add(new Klub("Wolverhampton Wanderers FC",
                "Peringkat 11 sementara EPL hingga pekan ke-8 dengan 10 poin",
                "https://m.media-amazon.com/images/M/MV5BMTdmNGZlMDMtNGY4ZS00ZTlmLTg3NzEtNTM4NzAzYThjOTRjXkEyXkFqcGdeQXVyMjUyNDk2ODc@._V1_SY500_CR0,0,575,500_AL_.jpg",
                "Wolverhampton Wanderers FC adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya. Klub ini memainkan pertandingan " +
                        "kandangnya di Stadion Molineux yang berkapasitas 32,050 penonton. Seragam mereka berwarna cokelat-hitam. Mereka dijuluki Wolves."));
        listKlub.add(new Klub("Manchester United FC",
                "Peringkat 12 sementara EPL hingga pekan ke-8 dengan 9 poin",
                "https://worldsportlogos.com/wp-content/uploads/2018/02/Manchester-United-logo.png",
                "Manchester United FC adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. " +
                        "Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke " +
                        "Old Trafford pada tahun 1910. Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, " +
                        "empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, " +
                        "satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, " +
                        "Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris"));
        listKlub.add(new Klub("Sheffield United FC",
                "Peringkat 13 sementara EPL hingga pekan ke-8 dengan 9 poin",
                "https://cdn.shopify.com/s/files/1/1888/7339/articles/H_Sheffield_United_1024x1024.png?v=1499088635",
                "Sheffield United FC adalah sebuah tim sepak bola profesional Inggris yang bermarkas di kota Sheffield, Yorkshire Selatan, Inggris. Tim ini dibentuk " +
                        "tahun 1889. Saat ini klub Sheffield United bermain di Football League One, kompetisi tingkat ke-3 dalam sistem liga sepak bola Inggris. Mereka adalah" +
                        " tim olahraga pertama yang menggunakan nama 'United' dan dijuluki The Blades, berkat reputasi kota Sheffield yang mendunia untuk produksi baja. " +
                        "Klub ini memainkan pertandingan kandangnya di Bramall Lane yang berkapasitas 33.000 penonton, stadion utama tertua di dunia dan masih menjadi tempat " +
                        "pertandingan sepak bola. Sheffield United menikmati masa jaya mereka antara tahun 1897 hingga tahun 1902, memenangkan Liga pada tahun 1898 dan " +
                        "Piala FA pada tahun 1899 dan 1902, dan dilanjutkan pada tahun 1915 dan 1925."));
        listKlub.add(new Klub("Brighton & Hove Albion FC",
                "Peringkat 14 sementara EPL hingga pekan ke-8 dengan 9 poin",
                "https://seeklogo.com/images/B/brighton-hove-albion-f-c-logo-3368C7D2CB-seeklogo.com.png",
                "Brighton & Hove Albion FC adalah sebuah klub sepak bola profesional asal Inggris yang berbasis di kota pantai Brighton & Hove, di timur Sussex. Sering " +
                        "disebut sebagai Brighton & Hove Albion atau hanya sekadar sebagai Brighton. Saat ini bermain di Liga Utama Inggris, kompetisi tingkat teratas dalam " +
                        "sepak bola Inggris. menggelar pertandingan di Stadion Falmer berpakasitas 30.750 penonton, yang dikenal dalam tujuan sponsor sebagai Stadion " +
                        "Komunitas American Express, atau singkatnya Amex.. Mereka akan menjalankan debut Liga Utama mereka di musim 2017-18 setelah menyegel promosi " +
                        "otomatis dari Kejuaraan EFL."));
        listKlub.add(new Klub("Aston Villa FC",
                "Peringkat 15 sementara EPL hingga pekan ke-8 dengan 8 poin",
                "https://clipart.info/images/ccovers/1503438188aston-villa-logo-png.png",
                "Aston Villa FC juga dikenal sebagai Villa, The Villa, The Villans dan The Lions)[5] adalah klub sepak bola profesional yang bermarkas di Villa Park, " +
                        "Birmingham, Inggris. Klub ini bermain di Liga Utama Inggris dan merupakan salah satu klub pendiri Liga Sepak Bola (Football League) pada tahun 1888 " +
                        "serta Liga Utama pada tahun 1992. Aston Villa merupakan salah satu klub tertua dan tersukses Inggris."));
        listKlub.add(new Klub("Newcastle United FC",
                "Peringkat 16 sementara EPL hingga pekan ke-8 dengan 8 poin",
                "https://upload.wikimedia.org/wikipedia/hif/2/25/Newcastle_United_Logo.png",
                "Newcastle United FC adalah klub sepak bola profesional Inggris yang berbasis di Newcastle upon Tyne, dan bermain di Liga Utama Inggris, kompetisi " +
                        "tingkat teratas dalam sepak bola Inggris. Newcastle United didirikan pada tahun 1892 sebagai hasil penggabungan Newcastle East End dan Newcastle West" +
                        " End, dan bermain di kandangnya saat ini, St James' Park, sejak saat itu. Stadion tersebut dikembangkan menjadi stadion all-seater pada pertengahan " +
                        "1990-an dan memiliki kapasitas 52.354."));
        listKlub.add(new Klub("Southampton FC",
                "Peringkat 17 sementara EPL hingga pekan ke-8 dengan 7 poin",
                "https://upload.wikimedia.org/wikipedia/hif/8/85/FC_Southampton.png",
                "Southampton FC (berdiri dengan nama St. Mary's YMA) merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, " +
                        "Southampton, Hampshire, Southampton pada musim 2011-12 bermain di Football League Championship. Southampton juga dikenal sebagai akademi sepak bola " +
                        "Liverpool."));
        listKlub.add(new Klub("Everton FC",
                "Peringkat 18 sementara EPL hingga pekan ke-8 dengan 7 poin",
                "https://upload.wikimedia.org/wikipedia/hif/0/07/Everton_F.C._%282014%E2%80%93%29.png",
                "Everton FC adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool. " +
                        "Didirikan pada tahun 1878 dan menjadi salah satu pendiri dari Liga Sepak Bola (Football League) pada tahun 1888 serta Liga Primer pada tahun 1992." +
                        "Saat ini berkompetisi di Liga Utama Inggris, divisi teratas Liga Inggris. Mereka telah berkompetisi di divisi teratas dengan rekor 108 musim, menjadi " +
                        "klub yang paling lama bermain di divisi teratas kompetisi sepak bola Inggris."));
        listKlub.add(new Klub("Norwich City FC",
                "Peringkat 19 sementara EPL hingga pekan ke-8 dengan 6 poin",
                "https://upload.wikimedia.org/wikipedia/hif/4/41/Norwich_City.png",
                "Norwich City FC adalah sebuah klub sepak bola Inggris yang didirikan pada tahun 1902. Bermarkas di Norwich, Norfolk. Norwich pada musim 2006-07 bermain " +
                        "di Liga Championship Inggris. Klub ini memainkan pertandingan kandangnya di Stadion Carrow Road yang berkapasitas 26.164 penonton. Seragam mereka " +
                        "berwarna kuning-hijau, sehingga mereka dijuluki Canaries (Kenari)."));
        listKlub.add(new Klub("Watford FC",
                "Peringkat 20 sementara EPL hingga pekan ke-8 dengan 3 poin",
                "https://upload.wikimedia.org/wikipedia/hif/3/30/Watford.png",
                "Watford FC merupakan tim sepak bola profesional Inggris yang bermarkas di Watford, Hertfordshire, dan bermain di Liga Utama Inggris. Klub ini memainkan" +
                        " pertandingan kandangnya di Stadion Vicarage Road yang berkapasitas 22.200 penonton. Seragam mereka berwarna kuning-merah. Menurut sejarah klub, " +
                        "Watford didirikan pada tahun 1881 sebagai klub sepak bola amatir dengan nama Watford Rovers oleh Henry Grover bersama dengan beberapa pemuda setempat." +
                        " Rovers pertama kali berkompetisi di Piala FA pada musim 1886-87. Pada tahun 1891 mereka menjadi tim sepak bola West Hertfordshire Club and Ground" +
                        " (biasanya disingkat menjadi West Herts) dan pada musim 1896 bergabung dengan Liga Selatan Inggris. Klub ini secara resmi bernama Watford F.C pada " +
                        "15 April 1898 sebagai hasil penggabungan West Herts dan Watford St Mary's."));
        dataKlub = new DataKlub(listKlub);
        dataKlub.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(dataKlub);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    public void onClick(View view, int position) {
        Klub klub = listKlub.get(position);
        Intent apkklub = new Intent(HalamanUtamaActivity.this,HalamanDetailActivity.class);
        apkklub.putExtra(Key_HalamanUtamaActivity,klub);
        startActivity(apkklub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.halamanutama:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamandetail:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamantentang:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
        return true;//super.onOptionsItemSelected(item);

    }
}
