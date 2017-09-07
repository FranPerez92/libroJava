import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testConstrucorVacio() {
		
		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertEquals("https://github.com/", p.getLinkGitHub());
		assertFalse(p.isTrabajador());
		
	}

	public void testConstructor(){
		
		Participante p1 = new Participante("ander" , "anderuraga");
		p1.setEmail("anderuraga@ipartek.com") ;
		
		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("anderuraga@ipartek.com", p1.getEmail());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());
		assertFalse(p1.isTrabajador());
	}
	
}
