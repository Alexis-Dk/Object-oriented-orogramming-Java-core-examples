package by.bntu.fitr.povt.callbackTheoryBasic.example2;

/**
 * @author Alexey Druzik on 17.12.2020
 */
interface OnResult {

    void onSuccess(double a, double b);
    void onError(Exception e);
}
