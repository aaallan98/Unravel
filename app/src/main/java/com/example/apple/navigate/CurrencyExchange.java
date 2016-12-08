package com.example.apple.navigate;

/**
 * Created by bolei on 12/7/2016.
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class CurrencyExchange {

    /**
     * base : EUR

     * rates : {"AUD":1.4884,"BGN":1.9558,"BRL":4.1296,"CAD":1.4894,"CHF":1.0946,"CNY":7.3903,"CZK":27.03,"DKK":7.4503,"GBP":0.7989,"HKD":8.8652,"HRK":7.5105,"HUF":313.3,"IDR":15007.54,"ILS":4.3182,"INR":75.8528,"JPY":128.07,"KRW":1315.78,"MXN":19.8996,"MYR":4.4382,"NOK":9.4401,"NZD":1.6518,"PHP":52.615,"PLN":4.244,"RON":4.4693,"RUB":77.543,"SEK":9.2413,"SGD":1.5389,"THB":40.115,"TRY":3.2285,"USD":1.1432,"ZAR":16.8758}
     */

    private String base;
    private String date;
    /**
     * AUD : 1.4884
     * BGN : 1.9558
     * BRL : 4.1296
     * CAD : 1.4894
     * CHF : 1.0946
     * CNY : 7.3903
     * CZK : 27.03
     * DKK : 7.4503
     * GBP : 0.7989
     * HKD : 8.8652
     * HRK : 7.5105
     * HUF : 313.3
     * IDR : 15007.54
     * ILS : 4.3182
     * INR : 75.8528
     * JPY : 128.07
     * KRW : 1315.78
     * MXN : 19.8996
     * MYR : 4.4382
     * NOK : 9.4401
     * NZD : 1.6518
     * PHP : 52.615
     * PLN : 4.244
     * RON : 4.4693
     * RUB : 77.543
     * SEK : 9.2413
     * SGD : 1.5389
     * THB : 40.115
     * TRY : 3.2285
     * USD : 1.1432
     * ZAR : 16.8758
     */

    private RatesEntity rates;

    public List<Currency> getCurrencyList(String Country){
        double a = 0.0;
        if(Country.equals("AUD")){
            a = rates.getAUD();
        }if(Country.equals("BGN")){
            a = rates.getBGN();
        }if(Country.equals("BRL")){
            a = rates.getBRL();
        }if(Country.equals("CAD")){
            a = rates.getCAD();
        }if(Country.equals("CHF")){
            a = rates.getCHF();
        }if(Country.equals("CNY")){
            a = rates.getCNY();
        }if(Country.equals("CZK")){
            a = rates.getCZK();
        }if(Country.equals("DKK")){
            a = rates.getDKK();
        }if(Country.equals("EUR")){
            a = 1;
        }if(Country.equals("GBP")){
            a = rates.getGBP();
        }if(Country.equals("HKD")){
            a = rates.getHKD();
        }if(Country.equals("HRK")){
            a = rates.getHRK();
        }if(Country.equals("HUF")){
            a = rates.getHUF();
        }if(Country.equals("IDR")){
            a = rates.getIDR();
        }if(Country.equals("ILS")){
            a = rates.getILS();
        }if(Country.equals("INR")){
            a = rates.getINR();
        }if(Country.equals("JPY")){
            a = rates.getJPY();
        }if(Country.equals("KRW")){
            a = rates.getKRW();
        }if(Country.equals("MXN")){
            a = rates.getMXN();
        }if(Country.equals("MYR")){
            a = rates.getMYR();
        }if(Country.equals("NOK")){
            a = rates.getNOK();
        }if(Country.equals("NZD")){
            a = rates.getNZD();
        }if(Country.equals("PHP")){
            a = rates.getPHP();
        }if(Country.equals("PLN")){
            a = rates.getPLN();
        }if(Country.equals("RON")){
            a = rates.getRON();
        }if(Country.equals("RUB")){
            a = rates.getRUB();
        }if(Country.equals("SEK")){
            a = rates.getSEK();
        }if(Country.equals("SGD")){
            a = rates.getSGD();
        }if(Country.equals("THB")){
            a = rates.getTHB();
        }if(Country.equals("TRY")){
            a = rates.getTRY();
        }if(Country.equals("USD")){
            a = rates.getUSD();
        }if(Country.equals("ZAR")){
            a = rates.getZAR();
        }
        DecimalFormat decimalFormat = new DecimalFormat("####.#####");
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("AUD", Double.parseDouble(decimalFormat.format(rates.getAUD()/a))));
        currencyList.add(new Currency("BGN", Double.parseDouble(decimalFormat.format(rates.getBGN()/a))));
        currencyList.add(new Currency("BRL", Double.parseDouble(decimalFormat.format(rates.getBRL()/a))));
        currencyList.add(new Currency("CAD", Double.parseDouble(decimalFormat.format(rates.getCAD()/a))));
        currencyList.add(new Currency("CHF", Double.parseDouble(decimalFormat.format(rates.getCHF()/a))));

        currencyList.add(new Currency("CNY", Double.parseDouble(decimalFormat.format(rates.getCNY()/a))));
        currencyList.add(new Currency("CZK", Double.parseDouble(decimalFormat.format(rates.getCZK()/a))));
        currencyList.add(new Currency("DKK", Double.parseDouble(decimalFormat.format(rates.getDKK()/a))));

        currencyList.add(new Currency("EUR", Double.parseDouble(decimalFormat.format(1.00/a))));
        currencyList.add(new Currency("GBP", Double.parseDouble(decimalFormat.format(rates.getGBP()/a))));
        currencyList.add(new Currency("HKD", Double.parseDouble(decimalFormat.format(rates.getHKD()/a))));

        currencyList.add(new Currency("HRK", Double.parseDouble(decimalFormat.format(rates.getHRK()/a))));
        currencyList.add(new Currency("HUF", Double.parseDouble(decimalFormat.format(rates.getHUF()/a))));
        currencyList.add(new Currency("IDR", Double.parseDouble(decimalFormat.format(rates.getIDR()/a))));
        currencyList.add(new Currency("ILS", Double.parseDouble(decimalFormat.format(rates.getILS()/a))));
        currencyList.add(new Currency("INR", Double.parseDouble(decimalFormat.format(rates.getINR()/a))));

        currencyList.add(new Currency("JPY", (Double.parseDouble(decimalFormat.format(rates.getJPY()/a)))));
        currencyList.add(new Currency("KRW", Double.parseDouble(decimalFormat.format(rates.getKRW()/a))));
        currencyList.add(new Currency("MXN", Double.parseDouble(decimalFormat.format(rates.getMXN()/a))));
        currencyList.add(new Currency("MYR", Double.parseDouble(decimalFormat.format(rates.getMYR()/a))));
        currencyList.add(new Currency("NOK", Double.parseDouble(decimalFormat.format(rates.getNOK()/a))));

        currencyList.add(new Currency("NZD", Double.parseDouble(decimalFormat.format(rates.getNZD()/a))));
        currencyList.add(new Currency("PHP", Double.parseDouble(decimalFormat.format(rates.getPHP()/a))));
        currencyList.add(new Currency("PLN", Double.parseDouble(decimalFormat.format(rates.getPLN()/a))));
        currencyList.add(new Currency("RON", Double.parseDouble(decimalFormat.format(rates.getRON()/a))));
        currencyList.add(new Currency("RUB", Double.parseDouble(decimalFormat.format(rates.getRUB()/a))));

        currencyList.add(new Currency("SEK", Double.parseDouble(decimalFormat.format(rates.getSEK()/a))));
        currencyList.add(new Currency("SGD", Double.parseDouble(decimalFormat.format(rates.getSGD()/a))));
        currencyList.add(new Currency("THB", Double.parseDouble(decimalFormat.format(rates.getTHB()/a))));
        currencyList.add(new Currency("TRY", Double.parseDouble(decimalFormat.format(rates.getTRY()/a))));
        currencyList.add(new Currency("USD", Double.parseDouble(decimalFormat.format(rates.getUSD()/a))));

        currencyList.add(new Currency("ZAR", Double.parseDouble(decimalFormat.format(rates.getZAR()/a))));

        return currencyList;
    }
    public List<String> getCurrencyNameList(){
        List<String> currencyNameList = new ArrayList<>();
        currencyNameList.add("AUD");
        currencyNameList.add("BGN");
        currencyNameList.add("BRL");
        currencyNameList.add("CAD");
        currencyNameList.add("CHF");

        currencyNameList.add("CNY");
        currencyNameList.add("CZK");
        currencyNameList.add("DKK");
        currencyNameList.add("EUR");
        currencyNameList.add("GBP");
        currencyNameList.add("HKD");

        currencyNameList.add("HRK");
        currencyNameList.add("HUF");
        currencyNameList.add("IDR");
        currencyNameList.add("ILS");
        currencyNameList.add("INR");

        currencyNameList.add("JPY");
        currencyNameList.add("KRW");
        currencyNameList.add("MXN");
        currencyNameList.add("MYR");
        currencyNameList.add("NOK");

        currencyNameList.add("NZD");
        currencyNameList.add("PHP");
        currencyNameList.add("PLN");
        currencyNameList.add("RON");
        currencyNameList.add("RUB");

        currencyNameList.add("SEK");
        currencyNameList.add("SGD");
        currencyNameList.add("THB");
        currencyNameList.add("TRY");
        currencyNameList.add("USD");

        currencyNameList.add("ZAR");

        return currencyNameList;
    }



    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesEntity getRates() {
        return rates;
    }

    public void setRates(RatesEntity rates) {
        this.rates = rates;
    }

    public static class RatesEntity {
        private double AUD;
        private double BGN;
        private double BRL;
        private double CAD;
        private double CHF;
        private double CNY;
        private double CZK;
        private double DKK;
        private double EUR;
        private double GBP;
        private double HKD;
        private double HRK;
        private double HUF;
        private double IDR;
        private double ILS;
        private double INR;
        private double JPY;
        private double KRW;
        private double MXN;
        private double MYR;
        private double NOK;
        private double NZD;
        private double PHP;
        private double PLN;
        private double RON;
        private double RUB;
        private double SEK;
        private double SGD;
        private double THB;
        private double TRY;
        private double USD;
        private double ZAR;

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getBGN() {
            return BGN;
        }

        public void setBGN(double BGN) {
            this.BGN = BGN;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getEUR() {
            return EUR;
        }

        public void setEUR(double EUR) {
            this.EUR = EUR;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }
    }
}
