package com.example.aulandini;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.aulandini.model.Anjing;
import com.example.aulandini.model.Hewan;
import com.example.aulandini.model.Kucing;
import com.example.aulandini.model.Paus;

public class DataProvider {
    private static final List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Paus> initDataPaus(Context ctx) {
        List<Paus> pauses = new ArrayList<>();
        pauses.add(new Paus("Biriu", "Brasil dan Venezuela",
                "Paus biru dianggap sebagai hewan terbesar yang pernah hidup di Bumi.", R.drawable.pausbiru));
        pauses.add(new Paus("Beluga", "Meksiko, Panama, Ekuador, Kosta Rika",
                "Paus beluga disebut \"canary laut\" oleh pelaut karena vokalisasi yang khas, yang kadang-kadang bisa terdengar melalui lambung kapal.", R.drawable.pausbeluga));
        pauses.add(new Paus("Bergigi", "Meksiko dan Ekuador",
                "Ia dikenal sebagai paus bergigi. Warna abu-abu dan penampilan \"tersenyum\" membuatnya mudah dikenali.", R.drawable.pausbergigi));
        pauses.add(new Paus("Bryde", "mencakup di seluruh dunia.",
                "Paus Bryde (diucapkan \"broodus\") dinamai untuk Johan Bryde, yang membangun stasiun penangkapan paus pertama di Afrika Selatan.", R.drawable.pausbryde));
        pauses.add(new Paus("Bungkuk", "Amerika Serikat dan Ontario",
                "Paus bungkuk dikenal sebagai \"New Englander bersayap besar\" karena memiliki sirip dada yang panjang, atau sirip dada, dan bungkuk.", R.drawable.pausbungkuk));
        pauses.add(new Paus("Sikat", "hutan Papua",
                "Paus Sikat Atlantik Utara adalah salah satu mamalia laut yang paling terancam punah, dengan hanya sekitar 400 yang tersisa.", R.drawable.paussikat));
        return pauses ;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataPaus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}