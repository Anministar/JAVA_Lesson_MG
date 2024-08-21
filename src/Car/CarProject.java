package Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CarProject {

    Connection conn;

    public CarProject() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/car";
        String userid = "root";
        String pwd = "my123456";

        Class.forName(driver);
        System.out.println("드라이버 연결 성공");
        System.out.println("데이터베이스 연결 준비...");
        conn = DriverManager.getConnection(url, userid, pwd);
        System.out.println("데이터베이스 연결 성공~");
    }

    private void selectList() throws SQLException {
        String sql = "SELECT * FROM car";
        Statement stmt = conn.createStatement();
        // executeQuery()를 사용해서 SELECT한 결과를 rs가 가진다.
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {	// rs.next() : 다음의 결과가 있다면 True, False
            System.out.printf("%s\n%s\n%s\n%s\n%s\n\n",
                    rs.getString("carparkNm"),		// 그 결과에서 carparkNm이라는 이름을 가지고 있는 열에 대한 정보를 가지고 온다.
                    rs.getString("phoneNum"),
                    rs.getString("addr"),
                    rs.getInt("parkCount"),
                    rs.getString("parkType"));
    		System.out.println("--------------------------------------------------------");
    		System.out.println("--------------------------------------------------------");
        }

        rs.close();
        stmt.close();
    }

    // 데이터 삽입
    private void insertOne() throws SQLException {
        String sql = "INSERT INTO car (carparkNm, addr, phoneNum, parkCount, parkType) "
                + "VALUES ('민서주차장', '울진군', '010-1111-2222', 757, '노상')";
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(sql);
        if (result == 1) {
            System.out.println("레코드 추가 성공!");
        } else {
            System.out.println("레코드 추가 실패");
        }
        stmt.close();
    }

    private void insertCar(Car car) throws SQLException {
//        if (isCarExist(car.getcarparkNm())) {
//            System.out.println(car.getcarparkNm() + " 레코드가 이미 존재합니다.");
//            return;
//        }

    	// INSERT INTO car (carparkNm, phoneNum, addr, parkCount, parkType) VALUES ( ? , ? , ? , ? , ? )
    	// car테이블의 5개 열에 우리가 아까 입력받은 주차장 정보를 삽입한다.
    	// ==> 이러한 구문을 sql 변수에 담아 pstmt에 SQL문을 전달
        String sql = "INSERT INTO car(carparkNm, phoneNum, addr, parkCount, parkType) "
                + "VALUES(?, ?, ?, ?, ?)";
        
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // 첫번째 ?에 car.getcarparkNm()를 설정
        pstmt.setString(1, car.getcarparkNm());
        // 두전째 ?에 car.getphoneNum()를 설정
        pstmt.setString(2, car.getphoneNum());
        pstmt.setString(3, car.getaddr());
        pstmt.setInt(4, car.getparkCount());
        pstmt.setString(5, car.getparkType());

        // executeUpdate() 메서드를 실행하면서 결과를 가지고 옴
        // 성공하면 레코드수에 따라서 달라짐. 1개의 데이터를 넣었기 때문에 1이 반환됨.
        // 실패하면 0을 반환
        int result = pstmt.executeUpdate();
        if (result == 1) {
            System.out.println(car.getcarparkNm() + " 레코드 추가 성공!");
        } else {
            System.out.println(car.getcarparkNm() + " 레코드 추가 실패!");
        }
        pstmt.close();
    }

//    private boolean isCarExist(String carparkNm) throws SQLException {
//        String sql = "SELECT COUNT(*) FROM car WHERE carparkNm = ?";
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//        pstmt.setString(1, carparkNm);
//        ResultSet rs = pstmt.executeQuery();
//
//        if (rs.next()) {
//            return rs.getInt(1) > 0;
//        }
//
//        rs.close();
//        pstmt.close();
//        return false;
//    }

    // 레코드 삭제
    private void delete(String carparkNm) throws SQLException {
        String sql = "DELETE FROM car WHERE carparkNm = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, carparkNm);
        int result = pstmt.executeUpdate();

        if (result == 1) {
            System.out.println(carparkNm + " 레코드 삭제 성공!!");
        } else {
            System.out.println(carparkNm + " 레코드 삭제 실패!!");
        }
        pstmt.close();
    }

    // 레코드 업데이트
    private void updateCar(String carparkNm, String phoneNum, String addr, int parkCount, String parkType) throws SQLException {
        String sql = "UPDATE car SET phoneNum = ?, addr = ?, parkCount = ?, parkType = ? WHERE carparkNm = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, phoneNum);
        pstmt.setString(2, addr);
        pstmt.setInt(3, parkCount);
        pstmt.setString(4, parkType);
        pstmt.setString(5, carparkNm);

        int result = pstmt.executeUpdate();
        if (result == 1) {
            System.out.println(carparkNm + " 레코드 업데이트 성공!");
        } else {
            System.out.println(carparkNm + " 레코드 업데이트 실패!");
        }
        pstmt.close();
    }
    
    // 특정 정보 검색
    private void searchCar(String cN) throws SQLException {
    	String sql = "SELECT * FROM car WHERE carparkNm= ?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.setString(1, cN);
    	ResultSet rs = pstmt.executeQuery();
    	
    	while(rs.next()) {
    		 System.out.printf("%s\n%s\n%s\n%s\n%s\n\n",
    				rs.getString("carparkNm"),
    				rs.getString("phoneNum"),
    				rs.getString("addr"),
    				rs.getInt("parkCount"),
    				rs.getString("parkType"));
    				
    		System.out.println("--------------------------------------------------------");
    		System.out.println("--------------------------------------------------------");
    	}
    	rs.close();
    	pstmt.close();
    	
    	
    }
    // 주소로 특정 정보 검색
    private void searchByAddress(String addr) throws SQLException {
        String sql = "SELECT * FROM car WHERE addr LIKE ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + addr + "%");
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n\n",
                    rs.getString("carparkNm"),
                    rs.getString("phoneNum"),
                    rs.getString("addr"),
                    rs.getInt("parkCount"),
                    rs.getString("parkType"));
            System.out.println("--------------------------------------------------------");
            System.out.println("--------------------------------------------------------");
        }
        rs.close();
        pstmt.close();
    }
        
    

    // API 호출 및 JSON 파싱
    private void fetchDataFromAPI() throws IOException, ParseException, SQLException, org.json.simple.parser.ParseException {
    	//  apiUrl 변수에 데이터를 가져올 API의 URL(주소)을 저장
    	//  URL Parameter에는 데이터의 개수, 서비스 키가 있음.
        String apiUrl = "https://api.odcloud.kr/api/15050093/v1/uddi:d19c8e21-4445-43fe-b2a6-865dff832e08?page=1&perPage=10&serviceKey=XMN%2FdNq3fvC83pgkLTkHZdFhFQ%2BmNyLCRWpDyyFBYIhCKJi7oy%2FhXjET4zCqtS%2B8shC8gi776IJLNCF0dnDLWA%3D%3D";
        
        // API응답 데이터를 저장하기 위한 StringBuilder 객체
        StringBuilder result = new StringBuilder();
        
        // URL 객체를 하나 생성 apiUrl을 설정
        URL url = new URL(apiUrl);
        
        // URL 안에 있는 클래스에 있는 openConnection() 이라는 메서드를 통해서 추상 클래스 URLConnetion 객체를 반환 --> 강제 형 변환을 통해 HttpURLConnection으로 형 변환
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();	
        
        // conn(Connection 클래스) 객체에서 setRequestMethod()라는 메서드 방식을 Get으로 지정
        // 데이터들을 조회(읽기)하기 위해서 GET방식으로 METHOD를 지정.
        conn.setRequestMethod("GET");

        // BufferedReader를 사용해 API 응답 데이터를 읽어옴.
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        String line;
        // 조건식 의미 : 읽을 코드 라인이 없을때까지 읽어라 !!
        // 데이터 한줄 읽었을 때 NULL값이 아니라면 ==> 데이터를 읽었다
        while ((line = reader.readLine()) != null) {
        	// 따라서 데이터를 읽었다면 result에다가 내용을 추가
            result.append(line);
        }
        // reader가 읽을 데이터가 없다는 의미
        // 리소스 반환
        reader.close();

        
        // JSONParser 클래스 객체를 생성하는 과정
        JSONParser parser = new JSONParser();
        // parse(해석하다), parser(해석기)
        // parser == JSONParser 객체
        // JSONParser 객체로 parse() 메서드를 사용 ==> 담아온 데이터를 문자열로 추가한 부분(result)를 JSON 객체로 파싱(해석)하는 과정
        JSONObject jsonObject = (JSONObject) parser.parse(result.toString());
        // jsonObject에서 data 키를 사용하여 데이터를 가져옴. 이 데이터 형식은 JSONArray형태로 가지고 옴.
        JSONArray dataArray = (JSONArray) jsonObject.get("data");

        // 순회(배열의 각 항목들을 하나씩 하나씩 접근)하며 JSONObject 형태로 캐스팅을 진행
        for (Object obj : dataArray) {
            JSONObject item = (JSONObject) obj;
            // 이름, 연락처, 주소, 구획 수, 유형 등의 데이터 정보를 가져옴.
            String carparkNm = (String) item.get("주차장명");
            String phoneNum = (String) item.get("연락처");
            String addr = (String) item.get("주차장지번주소");
            int parkCount = Integer.parseInt(item.get("주차구획수").toString());
            String parkType = (String) item.get("주차장유형");

            // Car 객체를 생성하여 주차장 정보를 저장.
            Car car = new Car(carparkNm, phoneNum, addr, parkCount, parkType);
            // insertCar 메서드를 호출하여 Car 객체를 데이터베이스에 삽입을 함.
            insertCar(car);
        }
    }
    
    
    // 모든 레코드 삭제
    private void deleteAll() throws SQLException {
        String sql = "DELETE FROM car";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        System.out.println("모든 레코드 삭제 완료.");
    }

    public static void main(String[] args) throws UnsupportedEncodingException, IOException, ParseException, ClassNotFoundException, SQLException {
        CarProject carProject = new CarProject();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("메뉴를 선택하세요");
            System.out.println("===============================================================================================");
            System.out.print(" 1. 정보 등록 ㅣ");
            System.out.print(" 2. 정보 수정 ㅣ");
            System.out.print(" 3. 정보 삭제 ㅣ");
            System.out.print(" 4. 전체 정보 ㅣ");
            System.out.print(" 5. 주소로 정보 검색 ㅣ ");
            System.out.print(" 6. 주차장명으로 정보 검색 ㅣ");
            System.out.print(" 7. 데이터베이스 초기화 ㅣ");
            System.out.println(" 9. 종료 ");
            System.out.println("===============================================================================================");
            System.out.println();
            System.out.println("번호 입력 >>");
            System.out.println();
           

            int menuNum = s.nextInt();
            s.nextLine(); // Enter 키 소비

            switch (menuNum) {
                case 1:
                    System.out.println("새로운 주차장 정보를 입력하세요.");
                    System.out.print("주차장명: ");
                    String newCarparkNm = s.nextLine();
                    System.out.print("연락처: ");
                    String newPhoneNum = s.nextLine();
                    System.out.print("주소: ");
                    String newAddr = s.nextLine();
                    System.out.print("주차 구획수: ");
                    int newParkCount = s.nextInt();
                    s.nextLine(); // Enter 키 소비
                    System.out.print("주차장 유형: ");
                    String newParkType = s.nextLine();
                    
                    Car newCar = new Car(newCarparkNm, newPhoneNum, newAddr, newParkCount, newParkType);
                    carProject.insertCar(newCar);
                    break;
                case 2:
                	   System.out.println("수정할 주차장 이름을 입력하세요.");
                       String updatedCarparkNm = s.nextLine();
                       System.out.print("새로운 연락처: ");
                       String updatedPhoneNum = s.nextLine();
                       System.out.print("새로운 주소: ");
                       String updatedAddr = s.nextLine();
                       System.out.print("새로운 주차 구획수: ");
                       int updatedParkCount = s.nextInt();
                       s.nextLine(); // Enter 키 소비
                       System.out.print("새로운 주차장 유형: ");
                       String updatedParkType = s.nextLine();
                       
                       // 업데이트 메소드 호출
                       carProject.updateCar(updatedCarparkNm, updatedPhoneNum, updatedAddr, updatedParkCount, updatedParkType);

                    
                    
                    break;
                    
                case 3:
                    System.out.println("삭제할 주차장명을 입력하세요:");
                    String carparkNm = s.next();
                    carProject.delete(carparkNm);
                    break;
                    
                case 4:	//모든 정보 검색
                    carProject.selectList();
                    break;
                    
                case 5:
                	System.out.println("검색할 주소를 입력하세요:");
                	String searchAddr =s.nextLine();
                	carProject.searchByAddress(searchAddr);
                	break;
                    
                    
                    // 메서드 생성
                    // 매개변수 
                case 6:
                	 System.out.println("검색할 주차장명을 입력하세요:");
                     String searchCarparkNm = s.nextLine();
                     carProject.searchCar(searchCarparkNm);
                     break;
                     
                case 7:
                	System.out.println("데이터를 초기화 하고 API 데이터를 불러옵니다.");
                	carProject.deleteAll();
                	carProject.fetchDataFromAPI();
                	break;
                    
                case 9:
                    s.close();
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 선택하세요.");
                    break;
                    
                    
                    
            }
        }
    }
}    
