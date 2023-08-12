package com.dhenis.polomorfismo.listas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import com.dhenis.polomorfismo.adaptadores.MadreAdapter;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.constructores.ConstructorHija;
import com.dhenis.polomorfismo.constructores.ConstructorHijo;
import com.dhenis.polomorfismo.constructores.ConstructorMadre;
import com.dhenis.polomorfismo.constructores.ConstructorPadre;

import java.util.ArrayList;
import java.util.List;

public class ListaMadre extends AppCompatActivity {

    private MadreAdapter adapter;
    private SearchView searchView;
    private List<ConstructorPadre> padreList;
    private List<ConstructorMadre> madreList;
    private List<ConstructorHijo> hijoList;
    private List<ConstructorHija> hijaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listamadre);

        ListView listView = findViewById(R.id.ListaM);
        searchView = findViewById(R.id.miSearchView);

        madreList = obtenerListaMadreDirectamente();
        padreList = obtenerListaPadresDirectamente();
        hijoList = obtenerListaHijosDirectamente();
        hijaList = obtenerListaHijasDirectamente();

        adapter = new MadreAdapter(this, madreList);
        listView.setAdapter(adapter);
        listView.setDivider(null);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ConstructorPadre padreSeleccionado = padreList.get(position);
                ConstructorMadre madreSeleccionada = madreList.get(position);
                ConstructorHijo hijoCorrespondiente = hijoList.get(position);
                ConstructorHija hijaCorrespondiente = hijaList.get(position);

                Intent intent = new Intent(ListaMadre.this, ListaHijos.class);
                intent.putExtra("nombrePadre", padreSeleccionado.getNombre());
                intent.putExtra("apellidoPaterno_padre", padreSeleccionado.getApellidoPaterno());
                intent.putExtra("apellidoMaterno_padre", padreSeleccionado.getApellidoMaterno());
                intent.putExtra("edadPadre", padreSeleccionado.getEdad()); // Cambiado a "edadPadre"
                intent.putExtra("foto_padre", padreSeleccionado.getImageUrl());

                intent.putExtra("nombreMadre", madreSeleccionada.getNombreMadre());
                intent.putExtra("apellidoPaternoMadre", madreSeleccionada.getApellidoPaterno_Madre());
                intent.putExtra("apellidoMaternoMadre", madreSeleccionada.getApellidoMaterno_Madre());
                intent.putExtra("edadMadre", madreSeleccionada.getEdad_Madre());
                intent.putExtra("foto_madre", madreSeleccionada.getImageUrl());

                // Pasar datos del hijo y la hija correspondientes
                intent.putExtra("nombreHijo", hijoCorrespondiente.getNombre());
                intent.putExtra("edadHijo", hijoCorrespondiente.getEdad());
                intent.putExtra("foto_hijo", hijoCorrespondiente.getImageUrl());

                intent.putExtra("nombreHija", hijaCorrespondiente.getNombre_Hija());
                intent.putExtra("edadHija", hijaCorrespondiente.getEdadHija());
                intent.putExtra("foto_hija", hijaCorrespondiente.getImageUrl());
                startActivity(intent);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        ImageView btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private List<ConstructorPadre> obtenerListaPadresDirectamente() {
        List<ConstructorPadre> padreList = new ArrayList<>();
        padreList.add(new ConstructorPadre(0, "Pedro", "Pinillos", "Carrasco", 30, "https://i.pinimg.com/originals/92/ff/06/92ff06f8f5a1685ac7aad850654cf86d.jpg"));
        padreList.add(new ConstructorPadre(1, "Luis", "Perez", "Lopez", 45, "https://i.pinimg.com/236x/fd/f2/75/fdf275cd184cbba4def2a9839b599113.jpg"));
        padreList.add(new ConstructorPadre(2, "Juan", "Lopez", "Gomez", 28,  "https://i.pinimg.com/236x/14/f6/e4/14f6e458adda9510ef711d3384d52f1c.jpg"));
        padreList.add(new ConstructorPadre(3, "Miguel", "Lopez", "Gomez", 28, "https://i.pinimg.com/736x/d2/75/34/d275347f8be865e18f5d3495f78d6246.jpg"));
        padreList.add(new ConstructorPadre(4, "Andrés", "Hernández", "Ramírez", 32, "https://i.pinimg.com/736x/c6/bf/2d/c6bf2d1048a458143e8393464ebbfd9d.jpg"));
        padreList.add(new ConstructorPadre(5, "Carlos", "González", "Ríos", 39, "https://i.pinimg.com/736x/77/98/b4/7798b48880d7e230e25a1c7279d51f59.jpg"));
        padreList.add(new ConstructorPadre(6, "Roberto", "Sánchez", "Mendoza", 51, "https://i.pinimg.com/474x/8f/0a/f5/8f0af5094f13aa31cbfa5bd7ea837fdf--blue-eyed-men-mens-eyes.jpg"));
        padreList.add(new ConstructorPadre(7, "Alejandro", "Martínez", "Vega", 29, "https://i.pinimg.com/564x/54/db/13/54db13f1deef6bf15ce17127aa98eb33.jpg"));
        padreList.add(new ConstructorPadre(8, "Antonio", "Rodríguez", "Silva", 36, "https://i.pinimg.com/originals/ee/d4/15/eed41500e47fcaa7c905fe736da0eb17.jpg"));
        padreList.add(new ConstructorPadre(9, "Javier", "Fernández", "Castillo", 42, "https://i.pinimg.com/1200x/cf/d2/84/cfd2848fb7704822d81d2d1a056db568.jpg"));
        padreList.add(new ConstructorPadre(10, "Héctor", "Lara", "Chávez", 27, "https://i.pinimg.com/originals/43/bf/b1/43bfb1665a47636424691fab99538178.jpg"));
        padreList.add(new ConstructorPadre(11, "Daniel", "Morales", "Ortega", 33, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ73vAqxzy5YOCZv6pWG-W9iHR6S6Qnj6kxIA&usqp=CAU"));
        padreList.add(new ConstructorPadre(12, "Carlos", "Nava", "Soto", 40, "https://i.pinimg.com/736x/84/f0/a3/84f0a30610a1f9f203e733ecf7decfb7.jpg"));
        padreList.add(new ConstructorPadre(13, "José", "Jiménez", "Delgado", 47, "https://i.pinimg.com/originals/e6/c4/bb/e6c4bbac0a04feac819a0e615e91b41d.jpg"));
        padreList.add(new ConstructorPadre(14, "Ricardo", "Pérez", "Mendoza", 28, "https://i.pinimg.com/736x/e7/10/45/e71045b0c09f7df23fc66da6278e2cfa.jpg"));
        padreList.add(new ConstructorPadre(15, "Fernando", "Vargas", "Reyes", 31, "https://i.pinimg.com/736x/a0/dd/d9/a0ddd9994e3404fca769f7d4cecb4fcc.jpg"));
        padreList.add(new ConstructorPadre(16, "David", "García", "Santos", 52, "https://i.pinimg.com/550x/c2/e3/c3/c2e3c30bb565b3d8a69bc197bbed1caf.jpg"));
        padreList.add(new ConstructorPadre(17, "Eduardo", "Hernández", "Núñez", 38, "https://i.pinimg.com/236x/77/c8/98/77c898ff6ec861f89d0293235abc030a--youtubers-la-web.jpg"));
        padreList.add(new ConstructorPadre(18, "Gabriel", "Ramos", "Ortega", 43, "https://i.pinimg.com/280x280_RS/2d/32/0a/2d320a335c1a336249bb64833a3929d7.jpg"));
        padreList.add(new ConstructorPadre(19, "Miguel", "Castro", "López", 25, "https://i.pinimg.com/736x/e0/7f/a6/e07fa6ca46673c7f040ecea62f967783.jpg"));
        padreList.add(new ConstructorPadre(20, "Mario", "Chávez", "Flores", 41, "https://i.pinimg.com/564x/39/89/b7/3989b70bee25f535966c9de7152385b4.jpg"));
        padreList.add(new ConstructorPadre(21, "Luis", "Sánchez", "Hernández", 49, "https://i.pinimg.com/564x/6b/4d/ea/6b4dea81c7574de6c3e29588e663baab.jpg"));
        padreList.add(new ConstructorPadre(22, "David", "Ramírez", "Guzmán", 30, "https://i.pinimg.com/564x/8b/ff/4a/8bff4a7645a1a2f322e0add49180cef8.jpg"));
        padreList.add(new ConstructorPadre(23, "Andrés", "Vega", "Cruz", 29, "https://i.pinimg.com/564x/e4/1e/49/e41e49bac736cb12cb1ed7a0934055c4.jpg"));
        padreList.add(new ConstructorPadre(24, "Alejandro", "Mendoza", "Pérez", 34, "https://i.pinimg.com/564x/bd/c5/fa/bdc5fadd4574eaeabf890ac3bd0c0923.jpg"));
        padreList.add(new ConstructorPadre(25, "Jorge", "López", "González", 37, "https://i.pinimg.com/564x/7f/96/f3/7f96f376cfb80b32262212735e146270.jpg"));
        padreList.add(new ConstructorPadre(26, "José", "Delgado", "Fernández", 46, "https://i.pinimg.com/564x/f6/50/5b/f6505b9bf6085bba78a8bef4445d5d72.jpg"));
        padreList.add(new ConstructorPadre(27, "Manuel", "Soto", "Hernández", 35, "https://st4.depositphotos.com/10313122/22020/i/600/depositphotos_220203928-stock-photo-businessman-with-blond-hair-against.jpg"));
        padreList.add(new ConstructorPadre(28, "Daniel", "Nava", "Ríos", 32, "https://i.pinimg.com/564x/e6/38/2b/e6382b9d4ecc99f5ba5630c81f7f71e3.jpg"));
        padreList.add(new ConstructorPadre(29, "Fernando", "Silva", "Martínez", 28, "https://i.pinimg.com/236x/f0/6e/49/f06e492e59bce5ccff5f55db5f002b6f.jpg"));
        padreList.add(new ConstructorPadre(30, "Francisco", "Castillo", "Hernández", 50, "https://i.pinimg.com/236x/55/b0/5d/55b05dc08bf68b977e231ec277b09583.jpg"));

        return padreList;
    }

    private List<ConstructorMadre> obtenerListaMadreDirectamente() {
        List<ConstructorMadre> madreList = new ArrayList<>();
        madreList.add(new ConstructorMadre(0, "María", "Gómez", "López", 29, "https://i.pinimg.com/564x/1a/40/3f/1a403faaf4584cd99ce3efb7c41da3fc--story-ideas-beautiful-people.jpg"));
        madreList.add(new ConstructorMadre(1, "Ana", "Fernández", "Ramírez", 44, "https://i.pinimg.com/564x/5e/eb/27/5eeb27d93265f440c96321c66c56cf65.jpg"));
        madreList.add(new ConstructorMadre(2, "Laura", "Martínez", "Vega", 31, "https://i.pinimg.com/564x/17/2f/73/172f737ae8211e91a774fc544777f542.jpg"));
        madreList.add(new ConstructorMadre(3, "Sofía", "Rodríguez", "Silva", 38, "https://i.pinimg.com/280x280_RS/31/de/06/31de065f03cffd477df7a9c1315f630c.jpg"));
        madreList.add(new ConstructorMadre(4, "Elena", "Pérez", "Mendoza", 33, "https://i.pinimg.com/1200x/d9/23/14/d923143b56d6779f2c6c54fd31903da4.jpg"));
        madreList.add(new ConstructorMadre(5, "Carolina", "Lara", "Chávez", 35, "https://i.pinimg.com/1200x/34/bc/c4/34bcc4ea2ab56c11d8c7a4a3eaf48743.jpg"));
        madreList.add(new ConstructorMadre(6, "Isabel", "González", "Ríos", 50, "https://i.pinimg.com/1200x/ed/20/d3/ed20d3e8b422dbf97946b003cfa3371a.jpg"));
        madreList.add(new ConstructorMadre(7, "Rosa", "Sánchez", "Hernández", 28, "https://i.pinimg.com/564x/15/20/d1/1520d1406f583b6dd2c1cfdb1b72afcb.jpg"));
        madreList.add(new ConstructorMadre(8, "Patricia", "Nava", "Soto", 46, "https://i.pinimg.com/1200x/6a/9f/a8/6a9fa8b298b5ee32628bd300f5c10a95.jpg"));
        madreList.add(new ConstructorMadre(9, "Luisa", "Cruz", "Ortega", 42, "https://i.pinimg.com/736x/9a/ff/b3/9affb34cd6e1e0579caa7a9e1f1d8136.jpg"));
        madreList.add(new ConstructorMadre(10, "Carmen", "Hernández", "Gómez", 39, "https://i.pinimg.com/originals/08/f5/0e/08f50e31a7e6fab84ed2d9eed6eb9112.jpg"));
        madreList.add(new ConstructorMadre(11, "Mónica", "Ramos", "López", 27, "https://i.pinimg.com/736x/9e/53/26/9e53265a033e8ad018bfa3fd0c600298.jpg"));
        madreList.add(new ConstructorMadre(12, "Alejandra", "Soto", "Fernández", 37, "https://i.pinimg.com/564x/3f/ac/58/3fac58b4887c0453c64ffb413ef50986.jpg"));
        madreList.add(new ConstructorMadre(13, "Gloria", "Guzmán", "Martínez", 29, "https://i.pinimg.com/474x/1e/e2/ba/1ee2baf1fddfd0c36d64a7558f449419.jpg"));
        /*madreList.add(new ConstructorMadre(14, "Beatriz", "Vargas", "Ramírez", 34, ""));
        madreList.add(new ConstructorMadre(15, "Verónica", "Díaz", "Silva", 40, ""));
        madreList.add(new ConstructorMadre(16, "Catalina", "Castro", "Mendoza", 31, ""));
        madreList.add(new ConstructorMadre(17, "Valeria", "Pérez", "Gómez", 26, ""));
        madreList.add(new ConstructorMadre(18, "Eva", "López", "Hernández", 41, ""));
        madreList.add(new ConstructorMadre(19, "Pamela", "García", "Vega", 36, ""));
        madreList.add(new ConstructorMadre(20, "Margarita", "Martínez", "Silva", 47, ""));
        madreList.add(new ConstructorMadre(21, "Lorena", "González", "Ramírez", 32, ""));
        madreList.add(new ConstructorMadre(22, "Juana", "Pérez", "López", 45, ""));
        madreList.add(new ConstructorMadre(23, "Raquel", "Rodríguez", "Silva", 28, ""));
        madreList.add(new ConstructorMadre(24, "Cecilia", "Lara", "Chávez", 33, ""));
        madreList.add(new ConstructorMadre(25, "Mireya", "Sánchez", "Hernández", 29, ""));
        madreList.add(new ConstructorMadre(26, "Fabiola", "Nava", "Soto", 36, ""));
        madreList.add(new ConstructorMadre(27, "Roxana", "Cruz", "Ortega", 42, ""));
        madreList.add(new ConstructorMadre(28, "Jimena", "Hernández", "Gómez", 27, ""));
        madreList.add(new ConstructorMadre(29, "Adriana", "Ramos", "López", 35, ""));
        madreList.add(new ConstructorMadre(30, "Claudia", "Soto", "Fernández", 46, ""));*/

        return madreList;
    }

    private List<ConstructorHijo> obtenerListaHijosDirectamente() {
        List<ConstructorHijo> hijoList = new ArrayList<>();

        hijoList.add(new ConstructorHijo(0, "Isaì", null, null, 10, "https://cdn.pixabay.com/photo/2013/12/13/11/53/children-227849_1280.jpg"));
        hijoList.add(new ConstructorHijo(1, "Jorge", null, null, 8, "https://cdnuploads.aa.com.tr/uploads/PhotoGallery/2021/11/29/thumbs_b2_b6426968c5f285239ae708c7f33a126b.jpg"));
        hijoList.add(new ConstructorHijo(2, "Luis", null, null, 9, "https://previews.123rf.com/images/zouzou1/zouzou11309/zouzou1130900414/22125312-un-ni%C3%B1o-muchos-rostros-serie-de-colegial-inteligente-6-7-a%C3%B1os-de-edad.jpg"));
        hijoList.add(new ConstructorHijo(3, "Carlos", null, null, 11, "https://www.crushpixel.com/big-static18/preview4/child-kid-boy-portrait-smiling-3053585.jpg"));
        hijoList.add(new ConstructorHijo(4, "Andrés", null, null, 7, "https://i.pinimg.com/236x/8c/19/76/8c19768b9462e4a993d7f44a26318423--cute-boys-kids-boys.jpg"));
        hijoList.add(new ConstructorHijo(5, "Miguel", null, null, 10, "https://img.freepik.com/foto-gratis/nino-worldface-russian-fondo-blanco_53876-146323.jpg?w=2000"));
        hijoList.add(new ConstructorHijo(6, "Juan", null, null, 9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTy9Fas-p8reAEVoaGGRwJCYkGJolFu9ILeTg&usqp=CAU"));
        hijoList.add(new ConstructorHijo(7, "Alejandro", null, null, 8, "https://uvn-brightspot.s3.amazonaws.com/assets/vixes/btg/curiosidades.batanga.com/files/Cientificos-demuestran-que-los-ninos-confian-mas-en-las-caras-bonitas-1_0.jpg"));
        hijoList.add(new ConstructorHijo(8, "José", null, null, 12, "https://e00-elmundo.uecdn.es/elmundo/imagenes/2006/06/02/1149265094_0.jpg"));
        hijoList.add(new ConstructorHijo(9, "David", null, null, 11, "https://previews.123rf.com/images/luislouro/luislouro1504/luislouro150400028/38687957-rostros-j%C3%B3venes-boy-haciendo-aislados-en-blanco.jpg"));
        hijoList.add(new ConstructorHijo(10, "Francisco", null, null, 10, "https://i.pinimg.com/564x/b9/8b/26/b98b267aff0d8ec8e769dc6732004e06.jpg"));
        hijoList.add(new ConstructorHijo(11, "Diego", null, null, 9, "https://i.pinimg.com/736x/74/58/7e/74587ecf6964ed7412012d70a7800995.jpg"));
        hijoList.add(new ConstructorHijo(12, "Daniel", null, null, 7, "https://i.pinimg.com/564x/f4/bb/1e/f4bb1e50a5d196676b84a95beeb88419.jpg"));
        hijoList.add(new ConstructorHijo(13, "Antonio", null, null, 8, "https://i.pinimg.com/564x/42/01/51/420151799fed62c0b3f95deb6961070d.jpg"));
        /*hijoList.add(new ConstructorHijo(14, "Ricardo", null, null, 10));
        hijoList.add(new ConstructorHijo(15, "Roberto", null, null, 11));
        hijoList.add(new ConstructorHijo(16, "Eduardo", null, null, 9));
        hijoList.add(new ConstructorHijo(17, "Manuel", null, null, 12));
        hijoList.add(new ConstructorHijo(18, "Hugo", null, null, 8));
        hijoList.add(new ConstructorHijo(19, "Fernando", null, null, 10));
        hijoList.add(new ConstructorHijo(20, "Pedro", null, null, 11));
        hijoList.add(new ConstructorHijo(21, "Gustavo", null, null, 7));
        hijoList.add(new ConstructorHijo(22, "Sergio", null, null, 9));
        hijoList.add(new ConstructorHijo(23, "Lorenzo", null, null, 10));
        hijoList.add(new ConstructorHijo(24, "Rafael", null, null, 8));
        hijoList.add(new ConstructorHijo(25, "Enrique", null, null, 10));
        hijoList.add(new ConstructorHijo(26, "Mariano", null, null, 9));
        hijoList.add(new ConstructorHijo(27, "Agustín", null, null, 11));
        hijoList.add(new ConstructorHijo(28, "Óscar", null, null, 7));
        hijoList.add(new ConstructorHijo(29, "Emilio", null, null, 8));
        hijoList.add(new ConstructorHijo(30, "Nicolás", null, null, 10));*/

        return hijoList;
    }


    private List<ConstructorHija> obtenerListaHijasDirectamente() {
        List<ConstructorHija> hijaList = new ArrayList<>();

        hijaList.add(new ConstructorHija(0, "María", null, null, 10, "https://meragor.com/files/styles//ava_800_800_wm/avatar-225119-037129.png"));
        hijaList.add(new ConstructorHija(1, "Ana", null, null, 8, "https://meragor.com/files/styles//ava_800_800_wm/avatar-224509-025720.png"));
        hijaList.add(new ConstructorHija(2, "Sofía", null, null, 9, "https://i.pinimg.com/236x/69/3e/5d/693e5d6fcc00772143f8ee871cb562b5.jpg"));
        hijaList.add(new ConstructorHija(3, "Carla", null, null, 11, "https://i.pinimg.com/236x/c3/1f/a2/c31fa28038e9a1777a6275303217f5f4.jpg"));
        hijaList.add(new ConstructorHija(4, "Elena", null, null, 7, "https://i.pinimg.com/236x/69/3e/5d/693e5d6fcc00772143f8ee871cb562b5.jpg"));
        hijaList.add(new ConstructorHija(5, "Luisa", null, null, 10, "https://i.pinimg.com/236x/f6/a4/13/f6a413c4aa52d9a37ec1a2db8228c02c.jpg"));
        hijaList.add(new ConstructorHija(6, "Valeria", null, null, 9, "https://i.pinimg.com/736x/ac/29/bd/ac29bd369ce8b2746ed3083de46db70f--boys-and-girls-cadillac.jpg"));
        hijaList.add(new ConstructorHija(7, "Camila", null, null, 8, "https://i.pinimg.com/originals/7e/ef/58/7eef587a87766adbafc1aaa61c82f9a3.jpg"));
        hijaList.add(new ConstructorHija(8, "Isabel", null, null, 12, "https://i.pinimg.com/564x/c8/b5/b8/c8b5b8e569559291c1175fdc4e42be20--newborn-baby-photography-photography-kids.jpg"));
        hijaList.add(new ConstructorHija(9, "Daniela", null, null, 11, "https://i.pinimg.com/736x/4e/af/db/4eafdb8b63397a02de7aee981e043fb8.jpg"));
        hijaList.add(new ConstructorHija(10, "Fernanda", null, null, 10, "https://i.pinimg.com/1200x/be/a8/59/bea85929a73d80e46f138f0bfd36857a.jpg"));
        hijaList.add(new ConstructorHija(11, "Laura", null, null, 9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsEA6CDR0N-_RA8DY14cN6a3NlZk2041YybQ&usqp=CAU"));
        hijaList.add(new ConstructorHija(12, "Alicia", null, null, 7, "https://i.pinimg.com/originals/7f/ff/98/7fff983b3bf23417da579167668ce0b2.jpg"));
        hijaList.add(new ConstructorHija(13, "Giselle", null, null, 8, "https://i.pinimg.com/736x/ed/3a/2a/ed3a2aa7aa0b110dd6bc4d43c70b1a76--user-profile-cute-babies.jpg"));
        /*hijaList.add(new ConstructorHija(14, "Valentina", null, null, 10, ""));
        hijaList.add(new ConstructorHija(15, "Roberta", null, null, 11));
        hijaList.add(new ConstructorHija(16, "Lucía", null, null, 9));
        hijaList.add(new ConstructorHija(17, "Carmen", null, null, 12));
        hijaList.add(new ConstructorHija(18, "Fabiola", null, null, 8));
        hijaList.add(new ConstructorHija(19, "Andrea", null, null, 10));
        hijaList.add(new ConstructorHija(20, "Patricia", null, null, 11));
        hijaList.add(new ConstructorHija(21, "Gloria", null, null, 7));
        hijaList.add(new ConstructorHija(22, "Lorena", null, null, 9));
        hijaList.add(new ConstructorHija(23, "Martha", null, null, 10));
        hijaList.add(new ConstructorHija(24, "Rosa", null, null, 8));
        hijaList.add(new ConstructorHija(25, "Cecilia", null, null, 10));
        hijaList.add(new ConstructorHija(26, "Mariana", null, null, 9));
        hijaList.add(new ConstructorHija(27, "Catalina", null, null, 11));
        hijaList.add(new ConstructorHija(28, "Eugenia", null, null, 7));
        hijaList.add(new ConstructorHija(29, "Renata", null, null, 8));
        hijaList.add(new ConstructorHija(30, "Natalia", null, null, 10));*/

        return hijaList;
    }
}
