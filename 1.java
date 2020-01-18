public string GetBiodata (string Nama_ , int  Usia_ )
        {
            Daftar < Biodata > bio_ =  Daftar baru  < Biodata > ();
            Daftar < List_school > schl =  Daftar baru  < List_school > ();
            Daftar < Keterampilan > skll =  Daftar baru  < Keterampilan > ();
            skll . Tambah ( Keterampilan baru {sklill_name =  " Java " , level =  " advanced " });
            skll . Tambah ( Keterampilan baru {sklill_name =  " Cisco " , level =  " advanced " });
            skll . Tambah ( Keterampilan baru {sklill_name =  " Pengembangan Seluler " , level =  " lanjutan " });
            schl . Tambah ( List_school baru {name =  " SMA Negeri 1 Medan " , year_in =  " 2013 " , year_out =  " 2016 " , major =  " Tidak ada bro " });
            schl . Tambah ( baru List_school {nama =  " Universitas Indonesia " , year_in =  " 2016 " , year_out =  " 2019 " , besar =  " Sistem Informasi " });
            string [] hobi = { " Swimming " , " Playing Game " };
            bio_ . Tambah ( Biodata baru {name =  Nama_ , age =  Usia_ , address =  " Jl Napitulupu Jambu No.2 " , hobi = hobi, is_married =  false , list_school = schl, skill = skll, interest_in_coding =  true });
            string sJSONResponse =  JsonConvert . SerializeObject (bio_);
            return sJSONResponse;
        }
         List_school kelas  publik
        {
            nama string publik {get; set; }
            public string year_in {get; set; }
            public string year_out {get; set; }
            public string major {get; set; }
        }
         Keterampilan kelas  publik
        {
            public string sklill_name {get; set; }
            level string publik {get; set; }
        }
         Biodata kelas  publik
        {
            nama string publik {get; set; }
             usia int publik {get; set; }
            public string address {get; set; }
            public string [] hobi {get; set; }
            bool publik is_married {get; set; }
             Daftar publik < List_school > list_school {get; set; }
             Daftar keterampilan < Keterampilan > publik {get; set; }
            bool publik interest_in_coding {get; set; }
        }