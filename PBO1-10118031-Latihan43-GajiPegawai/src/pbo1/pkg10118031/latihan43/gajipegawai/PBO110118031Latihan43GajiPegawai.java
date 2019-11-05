package pbo1.pkg10118031.latihan43.gajipegawai;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji pegawai
 */
public class PBO110118031Latihan43GajiPegawai {

    public static void main(String[] args) {
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        GajiPegawai karyawan1 = new GajiPegawai();
        karyawan1.setNama("Rizki Aria Putra");
        karyawan1.setAlamat("Jalan Sukagalih No 124");
        karyawan1.setUangTransport(250000);
        karyawan1.setUangTunjangan(300000);
        karyawan1.setGajiPokok(4500000);
        karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan(),
                 karyawan1.getUangTransport(), karyawan1.getGajiPokok()));
        karyawan1.tampilData(karyawan1.getNama(), karyawan1.getAlamat(),
                karyawan1.getUangTunjangan(), karyawan1.getUangTransport(),
                 karyawan1.getGajiPokok(), karyawan1.getTotalGaji());

    }

}
