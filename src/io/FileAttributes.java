package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class FileAttributes {
	
	public static void main(String[] args) throws IOException {
//		DosFileAttributeView dosView = Files.getFileAttributeView("",DosFileAttributeView.class);
//		dosView.setHidden(true);
//		dosView.setReadOnly(true);
//		dosView.setSystem(true);
//		dosView.setArchive(true);
		
		Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxrwxrwx");
	    FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions
	        .asFileAttribute(permissions);
		Files.createDirectory(Paths.get("test10"), fileAttributes);
		Files.createFile(Paths.get("someFile.txt"));
		
	}

}
