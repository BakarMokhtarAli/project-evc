package evcplus;

import java.util.Scanner;


public class EvcAss {

 
    public static void main(String[] args) {
        int pin=1122;
        int haraa=300;
        int accpin=1212;
        Scanner ok=new Scanner(System.in);
        System.out.println("Fadalan Gali pinkaaga");
        int pin1=ok.nextInt();
        if(pin1==pin){
            System.out.println("EVC MENU:-");
            System.out.println("1- itus haraagaaga");
            System.out.println("2- kaaarka hadalka");
            System.out.println("3- bixi biil");
            System.out.println("4- u wareeji evc plus");
            System.out.println("5- warbixin kooban");
            System.out.println("6- salaam bank");
            System.out.println("7- maareynta");
            System.out.println("8- taaj");
            System.out.println("9- bill payment");
            int choose=ok.nextInt();
            switch(choose){
                case 1:
                    if(choose==1){
                        System.out.println("haraagaga waa "+haraa);
                    }
                    break;
                case 2:
                    if(choose==2){
                        System.out.println("1- ku shubo Airtime");
                        System.out.println("2- ugu shub Airtime");
                        int kaarhadal=ok.nextInt();
                        if(kaarhadal==1){
                         System.out.println("fadlan gali lacgta");  
                         float lcg=ok.nextFloat();
                         if(lcg>haraa){
                             System.out.println("haraagaaga kugma filna");
                         }else{
                             System.out.println("mahubtaa inaad "+lcg+" ugu shubeysid undefined? \n1-Haa \n2-Maya");
                             int haamaya=ok.nextInt();
                             if(haamaya==1){
                                 System.out.println("waxaad ku shubatay "+lcg+"haraagaaga waa"+(haraa-lcg));
                             }else if(haamaya>=2){
                                 System.out.println("Macsalaamo");
                            
                             }else if(kaarhadal==2){
                                 System.out.println("fadlan gali lambarka");
                                 int num=ok.nextInt();
                                 if(num<610000000 || num>619999999){
                                     System.out.println("numberka aad galisay maahan mid jira");
                                 }
                             }
                         }
                        }if(kaarhadal==2){
                            System.out.println("fadaln gali mobileka");
                            int mobile=ok.nextInt();
                            if(mobile<610000000 || mobile>619999999){
                                System.out.println("numberka aad galisay maahan mid jira");
                            }else{
                                System.out.println("fadlan gali lacagta");
                                float money=ok.nextFloat();
                                if(money>haraa){
                                    System.out.println("haraagaaga kuguma filna");
                                }else{
                                    System.out.println("mahubtaa inaad $ "+money+" ugu shubeysid numberka "+mobile+"\n1-Haa \n2-Maya");
                                    int yesno=ok.nextInt();
                                    if(yesno==1){
                                        System.out.println("waxaad $ "+money+" ugu shubtay lambarka "+mobile+" haraagaaga waa "+(haraa-money));
                                    }else{
                                        System.out.println("Macsalaamo");
                                    }
                                }
                            }
                        }else{
                                        System.out.println("num so galisay ma aha mid jira");
                                    }
                    }
                    break;
                case 3:
                    if(choose==3){
                        System.out.println("1- Post paid");
                        System.out.println("2- Ku iibso");
                        int biil=ok.nextInt();
                        if(biil==1){
                            System.out.println("1- Ogow biilka");
                            System.out.println("2- Bixi Biil");
                            System.out.println("3- Ka Bixi Biil");
                            int biil1=ok.nextInt();
                            if(biil1==1){
                                System.out.println("error ocuured please try again");
                            }else if(biil1==2){
                                System.out.println("Fadlan gali lacgta");
                                float lcgbiil=ok.nextFloat();
                                if(lcgbiil>haraa){
                                  System.out.println("kuguma filna haraagaaga");
                            }else{
                                    System.out.println("Ma hubtaa inaad bixisid biil lacagtiisu tahay $"+lcgbiil+"\n1- Haa\n2-Maya");
                                    int haamayabiil=ok.nextInt();
                                    if(haamayabiil==1){
                                        System.out.println("waxaad bixisay biil lacagtiisu tahay $"+lcgbiil+" haraagaaga cusub waa "+(haraa-lcgbiil));
                                    }else{
                                        System.out.println("Macsalaama");
                                    }
                                }
                        }else if(biil1==3){
                            System.out.println("fadlan gali mobileka");
                            int mobilebiil=ok.nextInt();
                            if(mobilebiil<610000000 || mobilebiil>619999999){
                                System.out.println("numberka aad galisay maahan mid jiira");
                            }else{
                                System.out.println("fadlan gali lacagta");
                                float lcgbiil3=ok.nextFloat();
                                if(lcgbiil3>haraa){
                                  System.out.println("kuguma filna haraagaaga");
                                    }else{
                                    System.out.println("ma hubtaa inaa bixisid bill lacagtiisu tahay $"+lcgbiil3+" oo laga rabay tellNO: "+mobilebiil+"? \n1- Haa\n2- Maya");
                                    int haamayakabixibiil=ok.nextInt();
                                    if(haamayakabixibiil==1){
                                        System.out.println("waxaad bixisay biil lacagtiisu tahay $"+lcgbiil3+" oo laga rabay lambarka "+mobilebiil+" haraagaaga cusub waa"+(haraa-lcgbiil3));
                                    }else{
                                        System.out.println("Macsalaama");
                                    }
                                }
                            }
                        }else{
                            System.out.println("Macsalaama");
                        }
                    }else if(biil==2){
                        System.out.println("Fadlan Gali Aqoonsigaaga ganacsiga");
                    }else{
                         System.out.println("num so galisay ma aha mid jira");
                    }
                    }
                    break;
                case 4:
                    System.out.println("Fadlan soo Gali numberka lacagta ku diresid");
                    int num=ok.nextInt();
                    if(num<610000000 | num>619999999){
                        System.out.println("Lambarka aad galizay ma ahan mid jira");
                    }else
                        System.out.println("gali lacagta aad direesid");
                        float lcg=ok.nextFloat();
                        if(lcg>haraa){
                        System.out.println("haraagaaga kugma filna");}
                        else{
                             System.out.println("mahubtaa inaad udireesid "+num+ "lacag dhan $"+lcg+ " \n1-Haa \n2-Maya");
                             int haamaya=ok.nextInt();
                             if(haamaya==1){
                                 System.out.println("waxaad u dirtay "+num+" lacagdhan $"+lcg+" haraagaaga cusub waa"+(haraa-lcg));
                             }else if(haamaya>=2){
                                 System.out.println("Macsalaamo");}}
                    break;
                case 5:
                    if(choose==5)
                    System.out.println("1.Last Action");
                    System.out.println("2.Wareejintii u dambesay");
                    System.out.println("3.iibsashadii u dambesay");
                    System.out.println("4.Last 3 actioin");
                    int lastaction=ok.nextInt();
                    if(lastaction==1){
                      System.out.println("waxaad u dirtay 617116045 lacagdhan $200 haraagaaga cusub waa $100");    
                    }else if(lastaction==2){
                    System.out.println("1.u dirtay");
                    System.out.println("2.ka heshay");
                    int wareji=ok.nextInt();
                    if(wareji==1){
                    System.out.println("Fadlan soo Gali numberka");
                    int numb=ok.nextInt();
                    System.out.println("waxaad u dirtay 617116045 lacagdhan $200 haraagaaga waa $100"); 
                    }else if(wareji==2){
                    System.out.println("waxaad ka heshay 617116045 lacagdhan $300 haraagaaga waa $300"); 
                    
                   }}else if(lastaction==3){
                   System.out.println("Fadlan soo Gali aqoonsiga ganacsiga");
                    int numbe=ok.nextInt();
                    System.out.println("waxaad u dirtay FARAH shop (707172) lacag dhan $18 haraagaagu waa $210");
                   
                    
                   }if(lastaction==4){
                      System.out.println("A.waxaad u dirtay 617116045 lacagdhan $200 haraagaaga cusub waa $100");
                      System.out.println("B.waxaad ka heshay 619690705 lacagdhan $10 haraagaaga cusub waa $102");
                      System.out.println("C.waxaad u dirtay 617223445 lacagdhan $52 haraagaaga cusub waa $150");
                    }else{
                       System.out.println("macsalaama");
                   }
                    break;
                case 6:
                    if(choose==6){
                    
                     System.out.println("SALAAM BANK MENU");
                     System.out.println("1- itus haraagaaga");
                     System.out.println("2- lacag dhigasho");
                     System.out.println("3- lacag qaadasho");
                     System.out.println("4- ka wareeji evc plus");
                     System.out.println("5- ka wareeji accounkaga");
                     System.out.println("6- hubi wareejinta accountga");
                     System.out.println("7- maareynta bangiga");
                     System.out.println("8- kala bax");
                     int slm=ok.nextInt();
                     if(slm==1){
                     System.out.println("fadlan gali num sirta ee bangiga");
                     int fad=ok.nextInt();
                     if (fad==accpin){
                     System.out.println("koontada bangiga 21243509 haraagagu waa 30.00 USD");}
                     
                    }else if(slm==2){
                      System.out.println("fadlan gali lcgta");
                     int fadl=ok.nextInt();
                     System.out.println("fadlan gali macluumad");
                     int fadla=ok.nextInt();
                     System.out.println("fadlan gali num sirta ee bangiga");
                     int fadlan=ok.nextInt();
                     if(fadlan==accpin){
                      System.out.println("mahubtaa inaad dhigatid accounkaga bangiga lcg dhan "+fadl+" \n1-Haa \n2-Maya");
                             int haamay=ok.nextInt();
                             if(haamay==1){
                                 System.out.println("waxaad dhigatay lacag dhan "+fadl+" haraagaaga cusub waa"+(haraa-fadl));
                            }else
                                 System.out.println("num sireedkaga waa qalad pls try again");}}
                    else if(slm==3){
                      System.out.println("fadlan gali lcgta");
                     int fadl=ok.nextInt();
                     System.out.println("fadlan gali macluumad");
                     int fadla=ok.nextInt();
                     System.out.println("fadlan gali num sirta ee bangiga");
                     int fadlan=ok.nextInt();
                     if(fadlan==accpin){
                      System.out.println("mahubtaa inaad qadanesid  lcg dhan "+fadl+" \n1-Haa \n2-Maya");
                             int haamay=ok.nextInt();
                             if(haamay==1){
                                 System.out.println("waxaad qadatay lacag dhan "+fadl+" haraagaaga cusub waa"+(haraa-fadl));
                            }else
                                 System.out.println("num sireedkaga waa qalad pls try again");}}
                    else if(slm==4){
                    System.out.println("fadlan dooro xisaabta bangiga");
                    System.out.println("1.salaam somali bank");
                    System.out.println("2.bank beeraha");
                    System.out.println("3.darusalaam bank");
                    System.out.println("4.salaam sch");
                    int fa=ok.nextInt();
                    if(fa==1){
                    System.out.println("fadlan gali accountgaga");
                    int acc=ok.nextInt();
                    System.out.println("fadlan gali macluumaadka");
                    int mac=ok.nextInt();
                    System.out.println("macsalaamo");
                    
                    }
                    if(fa==2){
                    System.out.println("fadlan gali accountgaga");
                    int acce=ok.nextInt();
                    System.out.println("fadlan gali macluumaadka");
                    int mace=ok.nextInt();
                    System.out.println("macsalaamo");
                    
                    }
                    if(fa==3){
                    System.out.println("fadlan gali accountgaga");
                    int acco=ok.nextInt();
                    System.out.println("fadlan gali macluumaadka");
                    int maco=ok.nextInt();
                    System.out.println("macsalaamo");
                     
                    }
                    if(fa==4){
                    System.out.println("fadlan gali accountgaga");
                    int accs=ok.nextInt();
                    System.out.println("fadlan gali macluumaadka");
                    int macs=ok.nextInt();
                    System.out.println("macsalaamo");
                    
                    }
                    
                    }
                    else if(slm==5){
                    System.out.println("fadlan gali accountgaga");
                    int bu=ok.nextInt();
                    System.out.println("fadlan gali lacagta");
                    int but=ok.nextInt();
                    System.out.println("macluumaadka");
                    int butt=ok.nextInt();
                    System.out.println("fadlan gali num sirta ee accountiga");
                    int bull=ok.nextInt();
                    if(bull==accpin){
                      System.out.println("mahubtaa inaad kawareejizay accounkaga bangiga lcg dhan "+but+" \n1-Haa \n2-Maya");
                             int haama=ok.nextInt();
                             if(haama==1){
                                 System.out.println("waxaad wareejizay lacag dhan "+but+" haraagaaga cusub waa"+(haraa-but));
                            }else
                                 System.out.println("num sireedkaga waa qalad pls try again");}}
                    else if(slm==6){
                    System.out.println("fadlan gali otp");
                    int otp=ok.nextInt();
                     System.out.println("mahubtaa inaad aqbasho lacag diridan \n1-Haa \n2-Maya");
                             int haam=ok.nextInt();
                             if(haam==1){
                                 System.out.println("waxaad dirtay lacag dhan $30 account num 878787");
                            }else
                                 System.out.println("macsalaamo");
                    
                    }
                    else if(slm==7){
                    System.out.println("mareynta bangiga");
                    System.out.println("1.bedel pin-ka bangiga");
                    System.out.println("2.bedel passwordka ebank");
                    int mr=ok.nextInt();
                    if(mr==1){
                    System.out.println("fadlan gali num sirta ee bangiga");
                    int mrp=ok.nextInt();
                    if(mrp==accpin){
                    System.out.println("fadlan gali num sireedka czp e bangiga");
                    int npin=ok.nextInt();
                    System.out.println("fadlan hubi num sireedka czp e bangiga");
                    int npin2=ok.nextInt();
                    System.out.println("waxad badashay num siredka bangigaga mahadsanid");
                   
                    
                    }else
                        System.out.println("num sirta galisay waa qalad");
                    
                    }if(mr==2){
                     System.out.println("fadlan gali num sirta ee bangiga");
                    int mrp=ok.nextInt();
                    if(mrp==accpin){
                    System.out.println("fadlan gali num sireedka czp e bangiga");
                    int npin=ok.nextInt();
                    System.out.println("fadlan hubi num sireedka czp e bangiga");
                    int npin2=ok.nextInt();
                    System.out.println("waxad badashay num siredka bangigaga mahadsanid");
                   
                    
                    }else
                        System.out.println("num sirta galisay waa qalad");
                    
                    }
                    }
                    else if(slm==8){
                    System.out.println("fadlan gali aqoonsiga");
                    int npin3=ok.nextInt();
                    if(npin3==accpin){
                    System.out.println("fadlan gali lacagta aad labixi rabto");
                    int bixi=ok.nextInt();
                    System.out.println("mahubtaa inaad labixi donto lacag dhan $"+bixi+" \n1-Haa \n2-Maya");
                             int haa=ok.nextInt();
                             if(haa==1){
                                 System.out.println("waxaad la baxday lacag dhan $"+bixi+ "haraagagu waa $"+(haraa-bixi)+"");
                            }else
                                 System.out.println("macsalaamo");
                    }
                    
                    }else{
                        System.out.println("Macsalaama");
                    }
                    }
                    
                    
                    
            break;
                case 7:
                    if(choose==7){
                        System.out.println("1- badalka lambarta sirta ah");
                        System.out.println("2- bedel luuqada");
                        System.out.println("3- Wargeli mobile lumaay");
                        System.out.println("4- Lacag xirasho");
                        System.out.println("5- U celi lacag qaldantay");
                        System.out.println("6- EnableMobile Banking");
                        int maareynta=ok.nextInt();
                        if(maareynta==1){
                        System.out.println("Fadlan gali pin kaaga cusub");
                        int pincusub=ok.nextInt();
                        System.out.println("Fadlan Hubi pinkaaga cusub");
                        int pincusub1=ok.nextInt();
                        if(pincusub1==pincusub){
                            System.out.println("Waad ku guulesatay inaad badasho PIN-kaaga");
                        }else{
                            System.out.println("INPUT MISMATCH Waad ku guuldareysatay inaad badasho PIN-kaaga");
                        }   
                        } if(maareynta==2){
                            System.out.println("Fadlan dooro luuqada\n1- SOOMAALI\n2- ENGLISH");
                            int dooroluuqad=ok.nextInt();
                            if(dooroluuqad==1){
                                System.out.println("Waad ku guuleysatay inaad badasho luuqada");
                            }else if(dooroluuqad==2){
                                System.out.println("Waad ku guuleysatay inaad badasho luuqada");
                            }else{
                                System.out.println("Macsalaama");
                            }
                        }if(maareynta==3){
                            System.out.println("Fadaln Gali mobile ka lumay");
                            int mobilelumay=ok.nextInt();
                            if(mobilelumay<610000000 || mobilelumay>619999999){
                                System.out.println("Numberka aad galisay maahan mid jira");
                            }else{
                                System.out.println("fadlan gali lambarka sirta ah");
                                int numsir=ok.nextInt();
                                if(numsir==pin){
                                    System.out.println("Mahubtaa inaad u diiwaan galisid numberkan "+mobilelumay+"?\n1- Haa\n2- Maya");
                                    int haamayamobilelumay=ok.nextInt();
                                    if(haamayamobilelumay==1){
                                        System.out.println("waxaad u diiwaan galisay mobile lumay numberka "+mobilelumay+"!!");
                                    }else {
                                        System.out.println("Mahadsanid.!");
                                    }
                                }else{
                                    System.out.println("Lambarka sirta ah waa qalad");
                                }
                            }
                        }if(maareynta==4){
                            System.out.println("Fadlan gali lambarka khaladka ah");
                            int numkhalad=ok.nextInt();
                            if(numkhalad<610000000 || numkhalad>619999999){
                              System.out.println("numberka aad galisay maaahan mid jira");
                            }else{
                                System.out.println("fadlan gali lambarkii loo rabay");
                                int numkilorabay=ok.nextInt();
                                if(numkilorabay<610000000 || numkilorabay>619999999){
                                    System.out.println("numberka aad galisay maahan");
                                }else {
                                    System.out.println("Fadlan gali macluumaad");
                                    int macluumaad=ok.nextInt();
                                    System.out.println("Ma hubtaa inaa xiratay lacagata \n1- Haa\n2- Maya");
                                    int haamayamacluumaad=ok.nextInt();
                                    if(haamayamacluumaad==1){
                                        System.out.println("Waad ku guuleysatay inaad xiratao lacagta");
                                    }else {
                                        System.out.println("Dhaq dhaqaaqan mahan mid jira");
                                    }
                                }
                            }
                        }if(maareynta==5){
                            System.out.println("Fadlan Gali aqoonsiga lacag dirida");
                            int aqoonsi=ok.nextInt();
                            if(aqoonsi<610000000 || aqoonsi>619999999){
                                System.out.println("Invalid input fadlan soo gali aqoonsiga lacag dirida");
                            }else{
                                System.out.println("Fadlan gali macluumaad");
                                int macluumaad=ok.nextInt();
                                System.out.println("Ma hubtaa inaa celisid lacata \n1- Haa\n2- Maya");
                                int haamayaaqoonsi=ok.nextInt();
                                if(haamayaaqoonsi==1){
                                    System.out.println("Waad ku guuleysatay inaa u celsid lacagta numberka aqoonsigiisu yahay "+aqoonsi);
                                }else{
                                    System.out.println("Dhaq dhaqaaqan mahan mid jiro");
                                }
                            }
                        }if(maareynta==6){
                            System.out.println("Fadlan gali numberka is diiwaan galinta");
                            int numisdiwangalin=ok.nextInt();
                            System.out.println("Activation Record Not Found");
                        }else{
                            System.out.println("Macsalaama");
                        }
                            
                    }
                   
                    break;
                case 8:
                    if(choose==8){
                   System.out.println("1- Dibadda");
                    System.out.println("2- Ogoow Khidmada");
                    System.out.println("3- Macluumaadka xawaalada");
                    int taaj=ok.nextInt();
                    if(taaj==1){
                        System.out.println("Fadlan gali taleefanka qaaataha");
                        int tellqaate=ok.nextInt();
                        if(tellqaate<610000000 || tellqaate>619999999)
                        {
                            System.out.println("talefoonkan maahan mid jira");
                        }else{
                            {
                            System.out.println("Fadlan Gali magaca qaatah{a oo sedexan");
                            String mgcqaate=ok.nextLine();
                            System.out.println("Fadlan Gali magaalada qaataha uu joogo");
                            String mgloqaate=ok.nextLine();
                            System.out.println("Fadlan Gali lacagta");
                            float lcgta=ok.nextFloat();
                            System.out.println("Fadlan Gali macluumaad");
                            int macluumaad=ok.nextInt();
                            if(macluumaad==192){
                                System.out.println("Khidmada ma xisaabtaada ayaa laga jarayaa? \n1- Haa\n2- Maya");
                                int haamayaqaate=ok.nextInt();
                                if(haamayaqaate==1){
                                    System.out.println("waxaa laga jaray khidmadaada!");
                                }else{
                                    System.out.println("Macsalaama");
                                }
                            }else{
                                System.out.println("INVALID INPUT");
                            }
                        }
                    }
                    }else if(taaj==2){
                        System.out.println("Fadlan Dooro Shirkada:");
                        System.out.println("1- PAY TO EVCPLUS TMT");
                        System.out.println("2- TAAJ");
                        System.out.println("3- TaajPay");
                        System.out.println("4- New Etaaj");
                        System.out.println("5- TAAJ IPS");
                        int doorotaaj=ok.nextInt();
                        if(doorotaaj==1){
                            System.out.println("Fadlan Gali taleefanka qaataha");
                            int qaate=ok.nextInt();
                            if(qaate<610000000 || qaate>619999999){
                                System.out.println("Taleefanka qaataha mahan mid jira");
                            }else{
                                System.out.println("Fadlan Gali lacagta");
                                float lacag=ok.nextFloat();
                                if(lacag>haraa){
                                    System.out.println("haraagaaga kuguma filna");
                                }else{
                                    System.out.println("Waxaa laga jarayaa evc-kaaga? \n1- Haa\n2- Maya");
                                    int yesno=ok.nextInt();
                                    if(yesno==1){
                                        System.out.println("waxaad lacag udirtay taleefnak "+qaate+" lacag dhan $"+lacag+" Haraagaaga cusub waa "+(haraa-lacag));
                                    }else{
                                        System.out.println("Macsalaama");
                                    }
                                }
                            }
                        }if(doorotaaj==2){
                            System.out.println("fadlan gali taleefanka qaataha");
                            int qaate=ok.nextInt();
                            if(qaate<610000000 || qaate>619999999){
                                System.out.println("taleefnka maahan mid jiro");
                            }else{
                                System.out.println("Fadlan Gali lacagta");
                                float lacag=ok.nextFloat();
                                if(lacag>haraa){
                                    System.out.println("haraagaaga kuguma filna");
                                }else{
                                    System.out.println("Mahubta inaa u direysid lacag dhan $"+lacag+" lambarka "+qaate+"\n1- Haa\n2- Maya");
                                    int haamayaqaate=ok.nextInt();
                                    if(haamayaqaate==1){
                                        System.out.println("waxaad u dirtay qaataha numberkiisu yahay "+qaate+" lacag dhan $"+lacag+" haraagaaga cusub waa "+(haraa-lacag));
                                    }else{
                                        System.out.println("Macsalaama");
                                    }
                                }
                            }
                        }else if(doorotaaj==3){
                            System.out.println("Fadlan Gali taleeefanka Qaataha");
                            int qte=ok.nextInt();
                            if(qte<610000000 || qte>619999999){
                                System.out.println("taleefnkan maahan mid jira");
                            }else{
                                System.out.println("Fadlan gali lacagta");
                                float money=ok.nextFloat();
                                if(money>haraa){
                                    System.out.println("Haraagaaga kuguma filna");
                                }else{
                                    System.out.println("ma hubtaa inaad u direysid Qaataha "+qte+" lacag dhan $"+money+"\n1- Haa\n2- Maya");
                                    int haamayaqte=ok.nextInt();
                                    if(haamayaqte==1){
                                        System.out.println("waxaad u dirtay qaataha numberkiisu yahay "+qte+" lacag dhan $"+money+" haraagaaga cusub waa "+(haraa-money));
                                    }else{
                                        System.out.println("Macsalaama");
                                    }
                                }
                            }
                        }if(doorotaaj==4){
                             System.out.println("Fadlan Gali taleeefanka Qaataha");
                            int qte=ok.nextInt();
                            if(qte<610000000 || qte>619999999){
                                System.out.println("taleefnkan maahan mid jira");
                            }else{
                                System.out.println("Fadlan gali lacagta");
                                float money=ok.nextFloat();
                                if(money>haraa){
                                    System.out.println("Haraagaaga kuguma filna");
                                }else{
                                    System.out.println("ma hubtaa inaad u direysid Qaataha "+qte+" lacag dhan $"+money+"\n1- Haa\n2- Maya");
                                    int haamayaqte=ok.nextInt();
                                    if(haamayaqte==1){
                                        System.out.println("waxaad u dirtay qaataha numberkiisu yahay "+qte+" lacag dhan $"+money+" haraagaaga cusub waa "+(haraa-money));
                                    }else{
                                        System.out.println("Macsalaama");
                        }
                    }
                            }
                        }if(doorotaaj==5){
                             System.out.println("Fadlan Gali taleeefanka Qaataha");
                            int qty=ok.nextInt();
                            if(qty<610000000 || qty>619999999){
                                System.out.println("taleefnkan maahan mid jira");
                            }else{
                                System.out.println("Fadlan gali lacagta");
                                float money=ok.nextFloat();
                                if(money>haraa){
                                    System.out.println("Haraagaaga kuguma filna");
                                }else{
                                    System.out.println("ma hubtaa inaad u direysid Qaataha "+qty+" lacag dhan $"+money+"\n1- Haa\n2- Maya");
                                    int haamayaqte=ok.nextInt();
                                    if(haamayaqte==1){
                                        System.out.println("waxaad u dirtay qaataha numberkiisu yahay "+qty+" lacag dhan $"+money+" haraagaaga cusub waa "+(haraa-money));
                                    }else{
                                        System.out.println("Macsalaama");
                        }
                    }
                            }
                        }else{
                            System.out.println("Macsalaama");
                        }
                    }else if(taaj==3){
                        System.out.println("Fadlan Gali Aqoonsiga lacag dirida");
                        int aqonsi=ok.nextInt();
                        System.out.println("Some prametrs Are Missing please check your request");
                    }else{
                        System.out.println("Fadlan Gali Number sax Ah!");
                    } }
                    break;
                case 9:
                    if(choose==9){
                     System.out.println("1.itus haraagaga biilka");
                     System.out.println("2.wada bixi billka");
                     System.out.println("3.qeyb ka bixi billka");
                     int bilbixi=ok.nextInt();
                     if(bilbixi==1){
                     System.out.println("Fadlan gali bill refference number");
                                float lcgbiil=ok.nextFloat();
                                if(lcgbiil==accpin){
                                  System.out.println("unfineshed");
                            }else{
                                    System.out.println("haraagagu bill waa "+haraa);
                                
                     }
                                
                    }else if(bilbixi==2){
                     System.out.println("Fadlan gali bill refference number");
                                float lcgbiil=ok.nextFloat();
                                if(lcgbiil==accpin){
                     System.out.println("Fadlan gali lacgta");
                                float lcgbil=ok.nextFloat();
                                if(lcgbiil>haraa){
                                  System.out.println("kuguma filna haraagaaga");
                            }else{
                                    System.out.println("Ma hubtaa inaad bixisid biil lacagtiisu tahay $"+lcgbiil+"\n1- Haa\n2-Maya");
                                    int haamayabiil=ok.nextInt();
                                    if(haamayabiil==1){
                                        System.out.println("waxaad bixisay biil lacagtiisu tahay $"+lcgbiil+" haraagaaga cusub waa "+(haraa-lcgbiil));
                                    }else{
                                        System.out.println("Macsalaama");
                     }}
                    }}else if(bilbixi==3){
                    System.out.println("Fadlan gali bill refference number");
                                float lcgbiil=ok.nextFloat();
                                if(lcgbiil==accpin){
                     System.out.println("Fadlan gali lacgta");
                                float lcgbil=ok.nextFloat();
                                if(lcgbiil>haraa){
                                  System.out.println("kuguma filna haraagaaga");
                            }else{
                                    System.out.println("Ma hubtaa inaad qeyb ka bixinesid biil lacagtiisu tahay $"+lcgbiil+"\n1- Haa\n2-Maya");
                                    int haamayabiil=ok.nextInt();
                                    if(haamayabiil==1){
                                        System.out.println("waxaad qeyb ka bixisay biil lacagtiisu tahay $"+lcgbiil+" haraagaaga cusub waa "+(haraa-lcgbiil));
                                    }else{
                                        System.out.println("Macsalaama");
                    
                    }
                    
                    
                    }}}else{
                        System.out.println("Macsalaama");
                    }}
                    break;
                default:
                    System.out.println("macsalaamo");
                    break;
                    }
        }else{
            System.out.println("Lambar sireedkaga waa qalad");
        }
    }
    }