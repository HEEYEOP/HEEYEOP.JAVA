package Day20;

import java.util.*;

public class StdManager {
	
	//학생 정보들을 관리하기 위한 컬렉션 프레임웍이 필요
	//학생정보들은 중복되면 안되기 때문에 Set을 이용해야한다 (List를 이용할 경우 중복처리 해줘야하는 번거로움이 있다)
	
	
	private HashSet<Std> list = new HashSet<Std>();					//학생정보는 manager를 통해 접근되어야 하므로 접근제한자를 private으로 한다.
	
	
	
	
	
	//학생 정보 추가
	
	//기능 : 학생정보가 주어졌을때	 해당 학생 정보가 중복되지 않는다면 추가하고 성공을 알려주고, 중복된다면 추가하지 않고 false를 리턴하는 기능 
	//매개변수 : 학생정보 -> Std s
	//리턴타입 : boolean
	//매소드명 : insert
	public boolean insert(Std s){
		
		Std tmp = new Std(s);			//매개변수 s를 그대로 넣으면 list와 외부에서 s를 같이 쓴다. 따라서 s를 복사생성자를 이용하여 객체를 만든 후 추가한다.
		
		return list.add(tmp);			//add()라는 메소드는 list에 tmp와 일치하는 정보가 없으면 해당 객체를 추가하고 true를 리턴하며 tmp에 일치하는 정보가 있으면 추가하지 않고 flase를 리턴한다.
	}
	
	
	
	
	
	
	//학생 정보 검색
	
	//기능 : 학생정보가 주어지면 list에서 학생정보와 일치하는 학생이 있으면 해당 학생 정보를 반환하는 기능 (일치하는 객체가 없을 경우에 null값을 리턴하도록 한다)
	//매개변수 : 학생정보 Std s
	//리턴타입 : 학생정보 Std 
	//매소드명 : search
	public Std search(Std s){
		
		Iterator<Std> it = list.iterator(); 
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			
			if(tmp.equals(s))			//list에서 꺼낸 tmp와 s를 같은지를 equals를 이용하여 비교한 후 같으면 꺼낸 tmp를 반환
				return tmp;
		}
		return null;					//반복문이 종료될때까지 return이 안된것은 해당 정보와 일치하는 객체가 list에 없는 경우이기 때문에 null값을 리턴
	}
	
	
	
	
	
	
	//학생 정보 삭제
	
	//기능 : 학생정보가 주어지면 list에서 해당 학생의 정보를 삭제하는데, 일차하는 정보가 없으면 실패를 있으면 삭제를 해서 성공을 알려주는 기능
	//매개변수 : 학생정보 ->  Std s
	//리턴타입 : 실패 또는 성공 -> boolean
	//메소드명 : delete
	public boolean delete(Std s){
	
		Std tmp = search(s);		//search()를 통해 검색했을 때 일치하는 정보가 있으면 객체정보를, 없으면 null을 전달.
		
		return list.remove(tmp);	//remove()는 tmp라는 개체와 일치하는 정보가 있으면 해당 정보를 삭제한 후 true의 값을 리턴하고, 없으면 false값을 리턴한다.
		
	}
	
	
	
	
	
	
	//학생 정보 수정
	
	//기능 : 학생정보가 주어지면 기존 학생 정보를 수정하고 수정여부를 알려주는 기능
	//매개변수 : 학생정보 -> Std s
	//리턴타입 : 수정여부 -> boolean
	//메소드명 : update
	public boolean update(Std s){			//set에서 수정하려면 기존에 있는 객체를 삭제 후 수정된 객체 정보를 추가해야한다.
		
		if(!delete(s))						//삭제되지 않았으면 ->true가 아니라면 -> 일치하는 정보가 없었다는 것을 의미 
			return false;
		
		return insert(s);
	}

	
	
	
	
	
	//학생 정보 출력
	
	//기능 : 전체 학생 정보를 출력하는 기능
	//매개변수 : 없다
	//리턴타입 : 없다 -> void
	//메소드명 : print
	public void print(){	//!!!!!!!!!!!!밑에 코드 암기하라!!!!!!!!!!!!!
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			System.out.println(tmp);
		}
	}
	
	
	
	
	
	//---------------------아래 메소드들은 main에서 프로그램을 작성하기 위해 만들어준 메소드들--------------------------
	
	//기능 : 메뉴를 출력하는 기능
	public void printMenu(){
		System.out.println("------메뉴------");
		System.out.println("1.학생정보추가");
		System.out.println("2.학생정보수정");
		System.out.println("3.학생정보삭제");
		System.out.println("4.학생정보출력");
		System.out.println("5.종료");
		System.out.println("---------------");
		System.out.println("메뉴를 입력해주세요");
	}
	
	
	
	
	
	//기능 : Scanner가 주어지면 Scanner를 통해 학생 학번을 입력받아 학생 객체로 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 학생 객체 Std
	//메소드명 : inputId
	public Std inputId(Scanner scan){
		System.out.println("---정보를 입력하세요---");
		System.out.print("학번 :");
		String id = scan.next().trim();
		Std tmp = new Std();
		tmp.setId(id);
		return tmp;
	}
	
	
	
	public Std inputStd(Scanner scan){
		Std tmp = inputId(scan);
		
		System.out.println("이름 :");
		String name = scan.next();
		
		System.out.println("학교이름 :");
		String sName = scan.next();
		
		System.out.println("전공 :");
		String major = scan.next();
		
		System.out.println("-------------");
	
		tmp.setName(name);
		tmp.setSname(sName);
		tmp.setMajor(major);
	
	
		return tmp;
	
	}
	
	//기능 : 과목 정보를 입력받아 과목 객체를 생성하여 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 과목 객체 -> Grade 
	//메소드명 : inputSubject
	public Grade inputSubject (Scanner scan){
		
		String title, professor, step;
		int unit;
		
		System.out.println("교과목 :");
		title = scan.next();
		
		System.out.println("담당 교수 :");
		professor = scan.next();
		
		System.out.println("등급 :");
		step = scan.next();
		
		System.out.println("학점 :");
		unit = scan.nextInt();
		
		Grade tmp = new Grade(step, professor, title, unit);
		return tmp;
	}
	
	
	

}
