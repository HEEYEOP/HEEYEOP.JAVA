package Day16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 { //map : 키와 값의 쌍으로 이루어진 데이터의 집합 ,  순서는 유지되지 않으며, 키는 중복을 허용하지 않고 값은 중복을 허용한다.

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");	//asdf의 비밀번호는 1111이 아닌 1234이다. 왜??? 키는 중복을 허용하지 않기때문에  비밀번호를 덮어쓴다.
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id :");
			String id = scan.nextLine().trim();
			
			System.out.println("password :");
			String password = scan.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id)){									//containsKey()함수는 키값을 가져온다.
				System.out.println("입력하신 id는 존재하지 않습니다."+"다시 입력해주세요");
				continue;
				
			}else if( !(map.get(id)).equals(password)){					//get()함수는 value 값을 가져온다. --> 따라서 id객체의 value값을 가져와서 그게 입력받은 password와 같은 것인지 확인한다.
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요");
				}else{
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			
		}

		
		
	}

}
