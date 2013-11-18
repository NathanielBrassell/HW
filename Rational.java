public class Rational{

    private int _denom = 0;
    private int _num = 0;

    public Rational(){

	_num = 0;
	_denom = 1;

    }

    public Rational(int denom, int num){

	if (denom != 0){

	_num = num;
	_denom = denom;

	}

	else{

	    System.out.println("Invalid Denominator. Denominator cnnat be 0. Setting Numerator to 0 and Denominator to 1.");
	    _num = 0;
	    _denom = 1;

	}

    }

    public int getDenom(){

	return _denom;

    }

    public int getNum(){

	return _num;

    }

    public String toString(){

	return ""+_num+"/"+_denom;

    }

    public double floatValue(){

	return _num / _denom;

    }

    public void multiply(Rational s){

	_num *= s.getNum();
	_denom *= s.getDenom();

    }

    public void divide(Rational s){

	_num = (int)(_num / s.getNum());
	_denom = (int)(_denom / s.getDenom());

    }

    public void add(Rational s){

	int tempnums = s.getNum() * _denom;
	int tempnum = _num * s.getDenom();
	_num = tempnum + tempnums;
	_denom *= s.getDenom();

    }

    public void subtract(Rational s){

	int tempnums = s.getNum() * _denom;
	int tempnum = _num * s.getDenom();
	_num = tempnum - tempnums;
	_denom *= s.getDenom();

    }

    public int gcd(){
	if (_denom > _num){
	    if (_denom == 0){
		return _num;
	    }
	    else{
		return gcd (_denom, _num % _denom);
	    }
	}
	else{
	    if (_num == 0){
		return _denom;
	    }
	    else{
		return gcd ( _num, _denom % _num);	
	    }
	}
    }

    public void reduce(){

	int gdc = this.gdc();
	_num /= gdc;
	_denom /= gdc;

    }

    public static gdc (int a, int b){
	if (b > a){
	    if (b == 0){
		return a;
	    }
	    else{
		return gcder ( b, a % b);
	    }
	}
    }
    else{
	if (a == 0){
	    return b;
	}
	else{
	    return gcder ( a, b % a);
	}
    }

    public int compareTo(Rational s){

	if (this.floatValue() == s.floatValue()){
	    return 0;
	}
	else if(this.floatValue() > s.floatValue()){
	    return 1;
	}
	else{
	    return -1;
	}
    }
 
}
