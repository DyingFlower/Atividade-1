package atividadeplay;
public class Main {

	public static void main(String[] args) {
	//	Playdoarthur p = new Playdoarthur();

		Musica m1 = new Musica("Conto do zero em tec prog");
		m1.setDuracao(120);

		Musica m2 = new Musica("Samba do ano que vem tem mais");
		m2.setDuracao(890);

		Album album = new Album(m1);
		album.addMusica(m2);
		album.setArtista("Tec prog");

		Playdoarthur play = new Playdoarthur();
		play.addAlbum(album);

		//for (Album listalbum : play.getListaAlbum()) {
			//System.out.println("Nome do album: " + listalbum.getArtista());
			//for (Musica m : listalbum.getListaMusica()) {
				//System.out.println(m.getNome() + " - " + m.getDuracao() + "s");
			//}
		//}

		
		Navegador tocador = new Navegador();
		tocador.testeDoTocador(play);
		
		//PlayModerno playModerno= new PlayModerno();
		//	tocador.testeDoTocador(playModerno);
		
		//PlayDoidao doido = new PlayDoidao();
		//tocador.testeDoTocador(doido);
		
		
		// for (Musica musicas : album.getListaMusica()) {
		// System.out.println(musicas.getNome() + " - " + musicas.getDuracao()+ "s");
		// }
		//

		// p.start();
		// p.stop();
		// p.next();
		// p.back();
		// p.pause();

//		int[] a = { 1, 2, 2, 2 };
//
//		for (int i : a) {
//			System.out.println(i);
//		}
//
//		String[] nomes = { "joao", "maria" };
//
//		for (String n : nomes) {
//			System.out.println(n);
//		}

	}

	}

