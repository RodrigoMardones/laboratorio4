package modelo.repository;

import modelo.workingzone.WorkingZone;
import modelo.archivo.Archivo;
import modelo.repozone.RepoZone;

public interface RepositoryInterface {
    String repoName = "";
    // working directory
    WorkingZone workingDirectory = new WorkingZone();
    WorkingZone indexZone = new WorkingZone();
    RepoZone LocalRepo = new RepoZone();
    RepoZone RemoteRepo = new RepoZone();

    void gitInit(String repoName);
    String gitAdd();
    String gitCommit(String message);
    String gitPush();
    String gitPull();
    void gitStatus();
    void addFileToworkingDirectory(Archivo file);
}