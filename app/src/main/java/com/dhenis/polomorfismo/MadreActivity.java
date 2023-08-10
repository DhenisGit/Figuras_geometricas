package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MadreActivity extends AppCompatActivity {
    private SearchView SearchView_Madre;
    private AdapterM adapterM;
    private List<Padre> Listas_padre;
    private List<Madre> Listas_madre;
    private List<Hija> Listas_hija;
    private List<Hijo> Listas_hijo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_madre);
        ListView listView = findViewById(R.id.ListaM);
        SearchView_Madre = findViewById(R.id.Buscador_madre);
        Listas_madre = Vista_Lista_Madre();
        Listas_hijo = Vista_Lista_Hijo();
        Listas_hija = Vista_Lista_Hija();
        Listas_padre = Vista_Lista_Padre();
        adapterM = new AdapterM(this,Listas_madre);
        listView.setAdapter(adapterM);
        listView.setDivider(null);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Padre padre_designado = Listas_padre.get(position);
                Madre madre_designado= Listas_madre.get(position);
                Hijo hijo_designado = Listas_hijo.get(position);
                Hija hija_designado = Listas_hija.get(position);
                Intent intent = new Intent(MadreActivity.this, HijoActivity.class);
                intent.putExtra("nombreMadre", madre_designado.getNombre_madre());
                intent.putExtra("apellidoPaternoMadre", madre_designado.getApellido_p_madre());
                intent.putExtra("apellidoMaternoMadre", madre_designado.getApellido_m_madre());
                intent.putExtra("edadMadre", madre_designado.getEdad_madre());
                intent.putExtra("urlImagenMadre",madre_designado.getImageUrl_Madre());

                intent.putExtra("nombrePadre", padre_designado.getNombre());
                intent.putExtra("apellidoPaterno_padre", padre_designado.getApellido_p());
                intent.putExtra("apellidoMaterno_padre", padre_designado.getApliido_m());
                intent.putExtra("edad_padre", padre_designado.getEdad());
                intent.putExtra("urlImagenPadre",padre_designado.getImageUrl());


                intent.putExtra("nombreHijo", hijo_designado.getNombre_hijo());
                intent.putExtra("nombreHija", hija_designado.getNombre_hija());
                intent.putExtra("edadHijo", hijo_designado.getEdad_hijo());
                intent.putExtra("edadHija", hija_designado.getEdad_hija());
                intent.putExtra("urlImagenHijo", hijo_designado.getImageUrl_Hijo());
                intent.putExtra("urlImagenHija", hija_designado.getImageUrl_Hija());
                startActivity(intent);
            }
        });
        ImageView regresar = findViewById(R.id.btnRegresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private List<Madre> Vista_Lista_Madre(){
        List<Madre> Madre_lista = new ArrayList<>();
            Madre_lista.add(new Madre(0,"Maria","Mendoza","Gomez",25,"https://i.pinimg.com/564x/1a/40/3f/1a403faaf4584cd99ce3efb7c41da3fc--story-ideas-beautiful-people.jpg"));
            Madre_lista.add(new Madre(1,"Luisa","Rodriguez","Martinez",32,"https://i.pinimg.com/564x/5e/eb/27/5eeb27d93265f440c96321c66c56cf65.jpg"));
            Madre_lista.add(new Madre(2,"Ana","Perez","Lopez",28,"https://i.pinimg.com/564x/17/2f/73/172f737ae8211e91a774fc544777f542.jpg"));
            Madre_lista.add(new Madre(3,"Elena","Garcia","Fernandez",36,"https://i.pinimg.com/1200x/6a/9f/a8/6a9fa8b298b5ee32628bd300f5c10a95.jpg"));
            Madre_lista.add(new Madre(4,"Carmen","Sanchez","Alvarez",30,"https://i.pinimg.com/1200x/34/bc/c4/34bcc4ea2ab56c11d8c7a4a3eaf48743.jpg"));
            Madre_lista.add(new Madre(5, "Carmen", "Hernández", "Gómez", 39,"https://i.pinimg.com/236x/1f/ef/9b/1fef9b3330f8c921163379c945ccba23.jpg"));
            Madre_lista.add(new Madre(6, "Mónica", "Ramos", "López", 27,"https://i.pinimg.com/1200x/d9/23/14/d923143b56d6779f2c6c54fd31903da4.jpg"));
            Madre_lista.add(new Madre(7, "Alejandra", "Soto", "Fernández", 37,"https://i.pinimg.com/736x/9a/ff/b3/9affb34cd6e1e0579caa7a9e1f1d8136.jpg"));
            Madre_lista.add(new Madre(8, "Gloria", "Guzmán", "Martínez", 29,"https://i.pinimg.com/originals/08/f5/0e/08f50e31a7e6fab84ed2d9eed6eb9112.jpg"));
            Madre_lista.add(new Madre(9, "Beatriz", "Vargas", "Ramírez", 34,"https://i.pinimg.com/736x/9e/53/26/9e53265a033e8ad018bfa3fd0c600298.jpg"));
            Madre_lista.add(new Madre(10, "Verónica", "Díaz", "Silva", 40,"https://i.pinimg.com/564x/3f/ac/58/3fac58b4887c0453c64ffb413ef50986.jpg"));
            Madre_lista.add(new Madre(11, "Catalina", "Castro", "Mendoza", 31,"https://i.pinimg.com/474x/1e/e2/ba/1ee2baf1fddfd0c36d64a7558f449419.jpg"));
            Madre_lista.add(new Madre(12, "Valeria", "Pérez", "Gómez", 26,"https://i.pinimg.com/564x/6f/3a/61/6f3a61bdb4463c22db5bf8b735b70d92.jpg"));
            Madre_lista.add(new Madre(13, "Eva", "López", "Hernández", 41,"https://i.pinimg.com/564x/1f/7f/be/1f7fbef2cd0b8f29329db678c559e163.jpg"));
            Madre_lista.add(new Madre(14, "Pamela", "García", "Vega", 36,"https://i.pinimg.com/564x/02/bc/40/02bc40bb4d8689fcf1e2f3ed629ad91b.jpg"));
            Madre_lista.add(new Madre(15, "Margarita", "Martínez", "Silva", 47,"https://i.pinimg.com/564x/de/c9/e6/dec9e67bbada47e242de40a21e437900.jpg"));
            Madre_lista.add(new Madre(16, "Lorena", "González", "Ramírez", 32,"https://i.pinimg.com/564x/d1/09/d0/d109d019af3ab62949e02b994d6d6541.jpg"));
            Madre_lista.add(new Madre(17, "Juana", "Pérez", "López", 45,"https://i.pinimg.com/564x/e4/94/a8/e494a8a7ecdf6f403a47d2ed5fe5fceb.jpg"));
            Madre_lista.add(new Madre(18, "Raquel", "Rodríguez", "Silva", 28,"https://i.pinimg.com/564x/6a/6e/a7/6a6ea7987e0deb1251a40abe4b112a03.jpg"));
            Madre_lista.add(new Madre(19, "Cecilia", "Lara", "Chávez", 33,"https://i.pinimg.com/564x/fb/1a/14/fb1a147b81395687298e9d1f8878a34e.jpg"));
            Madre_lista.add(new Madre(20, "Mireya", "Sánchez", "Hernández", 29,"https://i.pinimg.com/564x/80/3e/fa/803efa4a082942b0e77c7454807990f2.jpg"));
            Madre_lista.add(new Madre(21, "Fabiola", "Nava", "Soto", 36,"https://i.pinimg.com/564x/d2/2d/ad/d22dad0aba019b06452da70fe96ab15a.jpg"));
            Madre_lista.add(new Madre(22, "Roxana", "Cruz", "Ortega", 42,"https://i.pinimg.com/564x/55/2a/5c/552a5c436970fbf36355da711e0cdac9.jpg"));
            Madre_lista.add(new Madre(23, "Jimena", "Hernández", "Gómez", 27,"https://i.pinimg.com/564x/79/2d/39/792d390189bfcfdda362a32b10eaeed6.jpg"));
            Madre_lista.add(new Madre(24, "Adriana", "Ramos", "López", 35,"https://i.pinimg.com/564x/4b/bc/ee/4bbcee7f41aa69a15253c747a514c930.jpg"));
            Madre_lista.add(new Madre(25, "Claudia", "Soto", "Fernández", 46,"https://i.pinimg.com/564x/30/97/3b/30973bf5b69fea5d247074cc3cae2324.jpg"));
        SearchView_Madre.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nuevo_Texto) {
                adapterM.getFilter().filter(nuevo_Texto);
                return false;
            }
        });
        return Madre_lista;
    }

    private List<Padre> Vista_Lista_Padre(){
        List<Padre> Padre_lista = new ArrayList<>();
        Padre_lista.add(new Padre(0, "Isai", "Pinillos", "Montalban", 30,"https://i.pinimg.com/236x/14/f6/e4/14f6e458adda9510ef711d3384d52f1c.jpg"));
        Padre_lista.add(new Padre(1, "John", "Doe", "Smith", 40,"https://i.pinimg.com/236x/fd/f2/75/fdf275cd184cbba4def2a9839b599113.jpg"));
        Padre_lista.add(new Padre(2, "Kevin", "Doe", "Johnson", 35,"https://i.pinimg.com/736x/d2/75/34/d275347f8be865e18f5d3495f78d6246.jpg"));
        Padre_lista.add(new Padre(3, "Michael", "Smith", "Brown", 28,"https://i.pinimg.com/736x/c6/bf/2d/c6bf2d1048a458143e8393464ebbfd9d.jpg"));
        Padre_lista.add(new Padre(4, "Samuel", "Johnson", "Davis", 45,"https://i.pinimg.com/736x/77/98/b4/7798b48880d7e230e25a1c7279d51f59.jpg"));
        Padre_lista.add(new Padre(5, "Robert", "Williams", "Miller", 33, "https://i.pinimg.com/474x/8f/0a/f5/8f0af5094f13aa31cbfa5bd7ea837fdf--blue-eyed-men-mens-eyes.jpg"));
        Padre_lista.add(new Padre(6, "Daniel", "Johnson", "Wilson", 38, "https://i.pinimg.com/564x/54/db/13/54db13f1deef6bf15ce17127aa98eb33.jpg"));
        Padre_lista.add(new Padre(7, "William", "Brown", "Martinez", 42, "https://i.pinimg.com/originals/ee/d4/15/eed41500e47fcaa7c905fe736da0eb17.jpg"));
        Padre_lista.add(new Padre(8, "Brian", "Davis", "Hernandez", 29, "https://i.pinimg.com/1200x/cf/d2/84/cfd2848fb7704822d81d2d1a056db568.jpg"));
        Padre_lista.add(new Padre(9, "Christopher", "Garcia", "Lee", 36, "https://i.pinimg.com/originals/43/bf/b1/43bfb1665a47636424691fab99538178.jpg"));
        Padre_lista.add(new Padre(10, "Matthew", "Rodriguez", "Clark", 31, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ73vAqxzy5YOCZv6pWG-W9iHR6S6Qnj6kxIA&usqp=CAU"));
        Padre_lista.add(new Padre(11, "Jose", "Martinez", "Lewis", 43, "https://i.pinimg.com/736x/84/f0/a3/84f0a30610a1f9f203e733ecf7decfb7.jpg"));
        Padre_lista.add(new Padre(12, "Andrew", "Hernandez", "Johnson", 39, "https://i.pinimg.com/564x/6b/4d/ea/6b4dea81c7574de6c3e29588e663baab.jpg"));
        Padre_lista.add(new Padre(13, "David", "Lopez", "Davis", 34, "https://i.pinimg.com/originals/e6/c4/bb/e6c4bbac0a04feac819a0e615e91b41d.jpg"));
        Padre_lista.add(new Padre(14, "William", "Miller", "Jones", 37, "https://i.pinimg.com/736x/e7/10/45/e71045b0c09f7df23fc66da6278e2cfa.jpg"));
        Padre_lista.add(new Padre(15, "Joseph", "Jackson", "Thomas", 41, "https://i.pinimg.com/736x/a0/dd/d9/a0ddd9994e3404fca769f7d4cecb4fcc.jpg"));
        Padre_lista.add(new Padre(16, "Charles", "White", "Wilson", 44, "https://i.pinimg.com/550x/c2/e3/c3/c2e3c30bb565b3d8a69bc197bbed1caf.jpg"));
        Padre_lista.add(new Padre(17, "Jason", "Lee", "Taylor", 27, "https://i.pinimg.com/236x/77/c8/98/77c898ff6ec861f89d0293235abc030a--youtubers-la-web.jpg"));
        Padre_lista.add(new Padre(18, "Matthew", "Clark", "Garcia", 30, "https://i.pinimg.com/280x280_RS/2d/32/0a/2d320a335c1a336249bb64833a3929d7.jpg"));
        Padre_lista.add(new Padre(19, "Robert", "Johnson", "Anderson", 46, "https://i.pinimg.com/736x/e0/7f/a6/e07fa6ca46673c7f040ecea62f967783.jpg"));
        Padre_lista.add(new Padre(20, "David", "Ramírez", "Guzmán", 30,"https://i.pinimg.com/564x/a9/d5/34/a9d534a4817a2806f49a546c2c13eb08.jpg"));
        Padre_lista.add(new Padre(21, "Andrés", "Vega", "Cruz", 29,"https://i.pinimg.com/564x/63/c2/f4/63c2f4354f0a8d4c448f7e732bf79364.jpg"));
        Padre_lista.add(new Padre(22, "Alejandro", "Mendoza", "Pérez", 34,"https://i.pinimg.com/564x/28/e6/27/28e6271bdc0e8d2383ecbbbe3a49f3d4.jpg"));
        Padre_lista.add(new Padre(23, "Jorge", "López", "González", 37,"https://i.pinimg.com/564x/26/f4/95/26f495c721af8ae58b263d98bef7239e.jpg"));
        Padre_lista.add(new Padre(24, "José", "Delgado", "Fernández", 46,"https://i.pinimg.com/736x/40/c4/e4/40c4e47ebec4f1680ddfa2bd170e6cba.jpg"));
        Padre_lista.add(new Padre(25, "Manuel", "Soto", "Hernández", 35,"https://i.pinimg.com/236x/8e/ad/59/8ead598e536c81b3889672384f8fc812.jpg"));
        SearchView_Madre.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nuevo_Texto) {
                adapterM.getFilter().filter(nuevo_Texto);
                return true;
            }
        });
        return Padre_lista;
    }

    private List<Hijo> Vista_Lista_Hijo(){
        List<Hijo> Hijo_lista = new ArrayList<>();
        Hijo_lista.add(new Hijo(0,"Martin",null,null,12,"https://i.pinimg.com/564x/bb/bd/81/bbbd81d39aa8062681a8a0e11d65c738.jpg"));
        Hijo_lista.add(new Hijo(1,"Juan",null,null,10,"https://i.pinimg.com/736x/66/ce/8a/66ce8a5ae084d0a19cfc9cf83d646d76--pretty-boys-character-inspiration.jpg"));
        Hijo_lista.add(new Hijo(2,"Luis",null,null,14,"https://i.pinimg.com/736x/66/94/f4/6694f4fc047ccefa6f3ec54d56902862.jpg"));
        Hijo_lista.add(new Hijo(3,"Diego",null,null,8,"https://i.pinimg.com/564x/a6/13/57/a61357771212bc39e0e66a2c62d384bc.jpg"));
        Hijo_lista.add(new Hijo(4,"Carlos",null,null,9,"https://i.pinimg.com/originals/79/cf/73/79cf7315ef471db1abed21308ab2166b.png"));
        Hijo_lista.add(new Hijo(5, "Manuel", null, null, 12,"https://i.pinimg.com/originals/9e/ac/87/9eac8762a77cfa3677a3a882bf76ec4e.png"));
        Hijo_lista.add(new Hijo(6, "Hugo", null, null, 8,"https://i.pinimg.com/originals/70/33/00/7033001268f1e4da4ad73af9bb14dd77.jpg"));
        Hijo_lista.add(new Hijo(7, "Fernando", null, null, 10,"https://i.pinimg.com/736x/f6/0f/f9/f60ff94e74fae3e6fb3a277b065d0023.jpg"));
        Hijo_lista.add(new Hijo(8, "Pedro", null, null, 11,"https://i.pinimg.com/736x/c3/e9/a7/c3e9a7aa0b3d1a20e67904adb2ddb9e5.jpg"));
        Hijo_lista.add(new Hijo(9, "Gustavo", null, null, 7,"https://i.pinimg.com/736x/dd/77/c1/dd77c1baca89e8561da5aa89879dec87--young-boys-young-man.jpg"));
        Hijo_lista.add(new Hijo(10, "Sergio", null, null, 9,"https://i.pinimg.com/736x/fb/78/92/fb7892d38128ba6ad6d8bbadaa677709--trendy-kids-cute-kids.jpg"));
        Hijo_lista.add(new Hijo(11, "Lorenzo", null, null, 10,"https://i.pinimg.com/736x/31/4f/b9/314fb99834e1da5b9fe1a32de82159ce.jpg"));
        Hijo_lista.add(new Hijo(12, "Rafael", null, null, 8,"https://i.pinimg.com/736x/09/27/34/092734bec96083e75fc45d33ec63deea.jpg"));
        Hijo_lista.add(new Hijo(13, "Enrique", null, null, 10,"https://i.pinimg.com/564x/e3/5f/5d/e35f5d9a155609591f5a6816f07cc142.jpg"));
        Hijo_lista.add(new Hijo(14, "Mariano", null, null, 9,"https://i.pinimg.com/1200x/cc/75/d9/cc75d991ad7b583e6df20fd6bcdd6ca3.jpg"));
        Hijo_lista.add(new Hijo(15, "Agustín", null, null, 11,"https://i.pinimg.com/564x/e6/c1/83/e6c18379b482eb600f48467df1e39d31.jpg"));
        Hijo_lista.add(new Hijo(16, "Óscar", null, null, 7,"https://i.pinimg.com/736x/98/3c/cc/983ccce4ed89418554868f786702e290.jpg"));
        Hijo_lista.add(new Hijo(17, "Emilio", null, null, 8,"https://i.pinimg.com/564x/42/01/51/420151799fed62c0b3f95deb6961070d.jpg"));
        Hijo_lista.add(new Hijo(18, "Nicolás", null, null, 10,"https://i.pinimg.com/564x/f4/bb/1e/f4bb1e50a5d196676b84a95beeb88419.jpg"));
        Hijo_lista.add(new Hijo(19, "Matías", null, null, 11,"https://i.pinimg.com/736x/74/58/7e/74587ecf6964ed7412012d70a7800995.jpg"));
        Hijo_lista.add(new Hijo(20, "Arturo", null, null, 9,"https://i.pinimg.com/564x/b9/8b/26/b98b267aff0d8ec8e769dc6732004e06.jpg"));
        Hijo_lista.add(new Hijo(22, "Benjamín", null, null, 12,"https://uvn-brightspot.s3.amazonaws.com/assets/vixes/btg/curiosidades.batanga.com/files/Cientificos-demuestran-que-los-ninos-confian-mas-en-las-caras-bonitas-1_0.jpg"));
        Hijo_lista.add(new Hijo(23, "Adrián", null, null, 8,"https://www.crushpixel.com/big-static18/preview4/child-kid-boy-portrait-smiling-3053585.jpg"));
        Hijo_lista.add(new Hijo(24, "Óliver", null, null, 10,"https://cdnuploads.aa.com.tr/uploads/PhotoGallery/2021/11/29/thumbs_b2_b6426968c5f285239ae708c7f33a126b.jpg"));
        Hijo_lista.add(new Hijo(25, "Leonardo", null, null, 9,"https://cdn.pixabay.com/photo/2013/12/13/11/53/children-227849_1280.jpg"));
        return Hijo_lista;
    }
    private List<Hija> Vista_Lista_Hija(){
        List<Hija> Hija_lista = new ArrayList<>();
        Hija_lista.add(new Hija(0,"Yasuri",null,null,13,"https://i.pinimg.com/originals/7e/ef/58/7eef587a87766adbafc1aaa61c82f9a3.jpg"));
        Hija_lista.add(new Hija(1,"Laura",null,null,15,"https://i.pinimg.com/736x/ac/29/bd/ac29bd369ce8b2746ed3083de46db70f--boys-and-girls-cadillac.jpg"));
        Hija_lista.add(new Hija(2,"Sofia",null,null,11,"https://i.pinimg.com/236x/f6/a4/13/f6a413c4aa52d9a37ec1a2db8228c02c.jpg"));
        Hija_lista.add(new Hija(3,"Isabella",null,null,9,"https://i.pinimg.com/236x/38/25/8a/38258ac2cb5b4d0a470e358e5e8a4238.jpg"));
        Hija_lista.add(new Hija(4,"Valentina",null,null,7,"https://i.pinimg.com/236x/69/3e/5d/693e5d6fcc00772143f8ee871cb562b5.jpg"));
        Hija_lista.add(new Hija(5, "Lorena", null, null, 9,"https://meragor.com/files/styles//ava_800_800_wm/avatar-225119-037129.png"));
        Hija_lista.add(new Hija(6, "Martha", null, null, 10,"https://i.pinimg.com/170x/c2/c4/5a/c2c45ac5999e8de2e59fa6361c2131c3.jpg"));
        Hija_lista.add(new Hija(7, "Rosa", null, null, 8,"https://i.pinimg.com/564x/c8/b5/b8/c8b5b8e569559291c1175fdc4e42be20--newborn-baby-photography-photography-kids.jpg"));
        Hija_lista.add(new Hija(8, "Cecilia", null, null, 10,"https://meragor.com/files/styles//ava_800_800_wm/avatar-224509-025720.png"));
        Hija_lista.add(new Hija(9, "Mariana", null, null, 9,"https://i.pinimg.com/736x/4e/af/db/4eafdb8b63397a02de7aee981e043fb8.jpg"));
        Hija_lista.add(new Hija(10, "Catalina", null, null, 11,"https://i.pinimg.com/originals/34/eb/52/34eb5250d82d9f70f7f17e55edefda56.jpg"));
        Hija_lista.add(new Hija(11, "Eugenia", null, null, 7,"https://i.pinimg.com/originals/8a/f3/34/8af334f4037e85947ca6df7200e2d2e9.jpg"));
        Hija_lista.add(new Hija(12, "Renata", null, null, 8,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvcWFN0oymsmmrXH8aNw84fKU6Y04ImAbpZw&usqp=CAU"));
        Hija_lista.add(new Hija(13, "Natalia", null, null, 10,"https://i.pinimg.com/736x/8c/05/e6/8c05e6621ff68f5d55c1b7b960da1c57.jpg"));
        Hija_lista.add(new Hija(14, "Beatriz", null, null, 11,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvcWFN0oymsmmrXH8aNw84fKU6Y04ImAbpZw&usqp=CAU"));
        Hija_lista.add(new Hija(15, "Marina", null, null, 9,"https://i.pinimg.com/736x/ed/3a/2a/ed3a2aa7aa0b110dd6bc4d43c70b1a76--user-profile-cute-babies.jpg"));
        Hija_lista.add(new Hija(16, "Angélica", null, null, 12,"https://i.pinimg.com/originals/7f/ff/98/7fff983b3bf23417da579167668ce0b2.jpg"));
        Hija_lista.add(new Hija(17, "Aurora", null, null, 8,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsEA6CDR0N-_RA8DY14cN6a3NlZk2041YybQ&usqp=CAU"));
        Hija_lista.add(new Hija(18, "Olivia", null, null, 10,"https://i.pinimg.com/1200x/be/a8/59/bea85929a73d80e46f138f0bfd36857a.jpg"));
        Hija_lista.add(new Hija(19, "Victoria", null, null, 9,"https://previews.123rf.com/images/rm211171/rm2111711408/rm211171140800204/31000461-hermoso-rostro-diversi%C3%B3n-ni%C3%B1as.jpg"));
        Hija_lista.add(new Hija(20, "Paulina", null, null, 7,"https://i.pinimg.com/564x/a6/fc/5c/a6fc5c4b56dffa33714073f4bdc543f5.jpg"));
        Hija_lista.add(new Hija(21, "Miranda", null, null, 8,"https://i.pinimg.com/736x/a9/7d/12/a97d12559e20eae13d20ac9650989b3a.jpg"));
        Hija_lista.add(new Hija(22, "Alejandra", null, null, 10,"https://i.pinimg.com/originals/8a/f3/34/8af334f4037e85947ca6df7200e2d2e9.jpg"));
        Hija_lista.add(new Hija(23, "Gabriela", null, null, 11,"https://meragor.com/files/styles//ava_800_800_wm/avatar-224166-019331.png"));
        Hija_lista.add(new Hija(24, "Elizabeth", null, null, 9,"https://i.pinimg.com/550x/a0/07/35/a00735d8eb9ff8e5fa510e39751f37a7.jpg"));
        Hija_lista.add(new Hija(25, "Ariana", null, null, 10,"https://i.pinimg.com/736x/c7/d7/f4/c7d7f4434eee193722bba8d940b73149--kid-photography-beautiful-children.jpg"));
        return Hija_lista;
    }
}
