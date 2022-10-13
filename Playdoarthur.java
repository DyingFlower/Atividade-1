package atividadeplay;
import java.util.Scanner;
import java.util.ArrayList;

public class Playdoarthur implements IPlay {
	Scanner leitor = new Scanner(System.in);
	public ArrayList<Album> listaAlbum;
		
	public Playdoarthur() {
		this.listaAlbum= new ArrayList<Album>();
	}
		
	public void addAlbum(Album a) {
		listaAlbum.add(a);
	}
		
	public ArrayList<Album> getListaAlbum(){
		return listaAlbum;
	}
	public void start() {
			
		for (Album album : listaAlbum) {
			for (Musica m : album.getListaMusica()) {
				System.out.println(m.getNome()+ "-" + m.getDuracao());
			}
		}
			
	}

		
		public void stop() {
			for (Album album : listaAlbum) {
				for(int i=0;i<album.getListaMusica().size();i++) {
					System.out.println("Deseja parar de ouvir? ");
					String t = leitor.next();
					if(t.equals("sim")) {
						System.out.println("Fim da playlist.");
						break;
					}
					else {
						System.out.println("Partindo para próxima playlist: ");
					}
				}
			}
			
		}

		
		public void next(int quantidade) {
			for (Album album : listaAlbum) {
				for (Musica m : album.getListaMusica()) {
					System.out.println("Deseja ver a próxima música?");
					String t= leitor.next();
					if(t.equals("sim")) {
						System.out.println(m.getNome());
					}
				}
				
			}
			
		}

		
		public void back(int quantidade) {
			for (Album album : listaAlbum) {
				for (Musica m : album.getListaMusica()) {
					System.out.println("Deseja ver a música anterior?");
					String t= leitor.next();
					if(t.equals("sim")) {
						System.out.println(m.getNome());
					}
				}
				
			}
		}

		
		public void pause() {
			for (Album album : listaAlbum) {
				for (Musica m : album.getListaMusica()) {
					System.out.println("Ouvindo "+ m.getNome());
					System.out.println("Aperte P para pausar musica.");
					String t= leitor.next();
					if(t.equals("p")) {
						System.out.println("Musica pausada, aperte P novamente para retomar");
						t= leitor.next();
						if(t.equals("p")) {
							break;
						}
					}
				}
			
		}
			
		}

		
		public String fabricante() {
			
			return "Arthur.";
		}

	}		
