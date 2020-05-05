package no5;

public class mainGS {
    public static void main(String[] args) {
        GetSet GS = new GetSet();
        
        GS.setNidn("0906078701");
        GS.setNamaDosen("Mardiyyah Hasnawi, S.Kom., M.T");
        GS.setJurusan("Teknik Informatika");
        GS.setFakultas("Ilmu Komputer");
        GS.setEmail("mardiyyah.hasnawi@umi.ac.id");
        
        System.out.println("Data Dosen PBO kelas B2 Angkatan 2018");
        System.out.println("NIDN        : "+GS.getNidn());
        System.out.println("Nama Dosen  : "+GS.getNamaDosen());
        System.out.println("Jurusan     : "+GS.getJurusan());
        System.out.println("Fakultas    : "+GS.getFakultas());
        System.out.println("Email       : "+GS.getEmail());
   
    }
    
}
