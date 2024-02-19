import java.util.Scanner;

public class QSn5 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int sz = 10;
        int arr[] = {10, 30, 20, 45, 60, 20, 20, 60, 20, 30};
        int  sArr[] = {10, 30, 20, 45, 60, 20, 20, 60, 20, 30};
     // pr("\nEnter the number of elements in array : ");
       //sz = kb.nextInt();
      //  int arr[] = new int[sz];
        //int sArr[] = new int[sz];
      //  getArrEls(arr, sz, sArr);

        sortArr(sArr, sz);//sort the sArray
        prArr(sArr, sz);//print sorted array
        rptedNos[] rptdNoArr = new rptedNos[sz];
        int noOfRptEls = buildRptdElsArr(sArr, sz, rptdNoArr);
        int toPrnArr[] = new int[noOfRptEls];
        buildToPrnArr(arr, sz,  rptdNoArr, noOfRptEls, toPrnArr);
        prArr(toPrnArr, noOfRptEls);
        kb.close();
    }

    static void buildToPrnArr(int[] arr, int sz,  rptedNos[] rptNos, int nRptEls, int[] toPrn)
    {
        int i = 0;
        int k = 0;
      //  int toPrn[] = new int[cnt];
        for (i = 0; i < sz; i++) {
            if( foundInArr(rptNos, nRptEls, arr[i]) && !foundInArr(toPrn, k, arr[i])  )
            {
               // pr("\nNumber found in existing array but not in Existing array : Number added to array" + arr[i]);
                //Number added to existingArr
                toPrn[k] = arr[i];
                k++;
            }
        }
    }
    static boolean foundInArr(rptedNos[] arr, int sz, int aNo)
    {
        int i = 0, j=0;
        boolean found = false;
        for (i = 0; i < sz; i++) {
                   if (arr[i].getNo() == aNo) {
                    found = true;
                  //  pr("\nElement found : " + aNo);
                    break;
                }
        }
        return found;
    }

    static boolean foundInArr(int[] arr, int sz, int aNo)
    {
        int i = 0, j=0;
        boolean found = false;
        for (i = 0; i < sz; i++) {
            if (arr[i] == aNo) {
                found = true;
              //  pr("\nElement found : " + aNo);
                break;
            }
        }
        return found;
    }

    static void getArrEls(int[] arr, int sz, int[] sArr) {
        Scanner kb = new Scanner(System.in);
        int i = 0;
        pr("\nEnter the array elements : ");
        for (i = 0; i < sz; i++) {
            pr("\nArray element No : " + (i + 1) + " :  ");
            arr[i] = kb.nextInt();
            sArr[i] = arr[i];
        }
        kb.close();
    }

    static int buildRptdElsArr(int[] sArr, int sz, rptedNos[] nt) {
        int i = 0, j = 0, indx = 0;
        int cnt = 0, k = 0;
        for (i = 0; i < sz - 1; i++) {
            cnt = 1;
            for (j = i + 1; j < sz; j++) {
                if (sArr[i] == sArr[j]) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                rptedNos it = new rptedNos(sArr[i], cnt);
                nt[k] = it;
                k++;
                i+=cnt-1;
              //  pr("\nAdding rpt-cnt : " + arr[i] + " : " + cnt + " at indx : " + k);
            }
        }
        //elCnt.setCnt(k);
        return k;
    }

    static void sortArr(int[] sArr, int sz) {
        int i = 0, j = 0, indx = 0;
        for (i = 0; i < sz; i++) {
            indx = i;
            for (j = i + 1; j < sz; j++) {
                //ascending order
                if (sArr[indx] > sArr[j]) {
                    indx = j;
                }
            }
            if (indx != i) {
                int temp = sArr[indx];
                sArr[indx] = sArr[i];
                sArr[i] = temp;
            }
        }
    }

    static class rptedNos {
        private int theNo = 0;
        private int theCnt = 0;

        public rptedNos() {

        }

        public rptedNos(int aNo, int aCnt) {
            this.theNo = aNo;
            this.theCnt = aCnt;
        }

        int getNo() {
            return theNo;
        }

        void setNo(int aNo) {
            theNo = aNo;
        }

        void setCnt(int aCnt) {
            theCnt = aCnt;
        }

        int getCnt() {
            return theCnt;
        }

    }

    static void prRptdElsArr(rptedNos[] arr, int sz) {
        int i = 0;
        for (i = 0; i < sz; i++) {
            pr("\ntheElement : " + arr[i].getNo() + "\tNo ofRpts : " + arr[i].getCnt());
        }
    }

    static void pr(String msg) {
        System.out.print(msg);
    }

    static void pr() {
        pr("\n");
    }

    static void prArr(int[] arr, int sz) {
        int i = 0;
        for (i = 0; i < sz; i++) {
            pr("\t" + arr[i]);
        }
        pr();
    }
}
