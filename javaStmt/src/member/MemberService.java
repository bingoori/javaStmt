package member;

public interface MemberService {
public String join(MemberBean member);
public boolean login(String id,String password);
public MemberBean detail(String id);
public MemberBean update(String id, String string, int i, String string2);
public String remove(String id);

}
