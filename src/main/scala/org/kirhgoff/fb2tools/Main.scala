package org.kirhgoff.umka

import java.io.InputStream
import java.util
import java.util.zip.{ZipFile, ZipEntry}


object Main {
  private val SAMPLE = "zip file"

  def main(args: Array[String]) {
    println ("FB2 tools started")
    val zipFile = new ZipFile(SAMPLE);

    val entries = zipFile.entries();

    while(entries.hasMoreElements()){
      val entry = entries.nextElement();
      //InputStream stream = zipFile.getInputStream(entry);
      print(s"Entry: ${entry.getName}")
    }
  }

}
