package com.stone.core.work.util.test;


public class Test {

    public static void main(String[] args) {

        //		try {
        //			String policyNo = null;
        //			Preconditions.checkArgument(policyNo!=null  
        //					,"Argument is not initialied, policyNo must not be null!");
        //		} catch (Exception e) {
        //			// TODO: handle exception
        //			System.out.println(e.getMessage());
        //		}
        //		

        //		List<A> listBillInfo = new ArrayList<A>();
        //		
        //		listBillInfo.add(new A("0","1","2014-01-02"));
        //		listBillInfo.add(new A("1","0",""));
        //		listBillInfo.add(new A("2","1","2014-01-04"));
        //		listBillInfo.add(new A("3","1","2014-01-05"));
        //		listBillInfo.add(new A("4","0",""));
        //		listBillInfo.add(new A("5","1","2014-01-07"));
        //		listBillInfo.add(new A("6","1","2014-01-08"));
        //		listBillInfo.add(new A("7","1","2014-01-09"));
        //		listBillInfo.add(new A("8","0",""));
        //		listBillInfo.add(new A("9","1","2014-01-11"));
        //		listBillInfo.add(new A("10","1",""));

        //		if(listBillInfo!=null&&listBillInfo.size()>0){
        //			//�������տ����ڰ���������
        //			Collections.sort(listBillInfo, new Comparator<A>(){
        //				public int compare(A arg0, A arg1){
        //					return arg0.getB().compareTo(arg1.getB());
        //				}
        //			});
        //		}
        //		
        //		for(A a: listBillInfo){
        //			System.out.println(a.getId()+"=="+a.getB()+"---"+a);
        //			
        //		}

        Byte a = (byte) 12;
        System.out.println(a);

    }

}

class A {
    String id;

    String a;

    String b;

    A() {
    }

    A(String id, String a, String b) {
        this.id = id;
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
