package com.turkcellCamp;

public class EdevletValidatorAdaptor implements CustomerControlService {

    @Override
    public boolean isValid(Customer customer) {
        EdevletService edevletService = new EdevletService();
        return edevletService.dogrula(new Ciziten(customer.getAd(), customer.getSoyad(),customer.getTcNo(),customer.getDogumYili()));
    }

}