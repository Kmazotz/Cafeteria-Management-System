using DataServices.Extensions;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DataServices.Connectors
{
    /// <summary>
    /// 
    /// </summary>
    public abstract class DBConnector
    {
        // Implements abstrct factory for create connections

        /// <summary>
        /// 
        /// </summary>
        protected string Server { get; set; }

        /// <summary>
        /// 
        /// </summary>
        protected string DataBase { get; set; }

        /// <summary>
        /// 
        /// </summary>
        protected int Port { get; set; }

        /// <summary>
        /// 
        /// </summary>
        protected string User { get; set; }

        /// <summary>
        /// 
        /// </summary>
        protected string Password { get; set; }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="server"></param>
        /// <param name="dataBase"></param>
        /// <param name="port"></param>
        /// <param name="user"></param>
        /// <param name="password"></param>
        public DBConnector(string server, string dataBase, int port, string user, string password)
        {
            Server = server;
            DataBase = dataBase;
            Port = port;
            User = user;
            Password = password;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public virtual string CreateConnection()
        {
            DbConnectionStringBuilder connection = new DbConnectionStringBuilder(true);
            connection.Add("Server", Server);
            connection.Add("Database", DataBase);
            connection.Add("Port", Port);
            connection.Add("User", User);
            connection.Add("Password", Password);
            return connection.ConnectionString;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="parameters"></param>
        /// <returns></returns>
        public string CreateConnection(params ValueTuple<string, string>[] parameters)
        {
            DbConnectionStringBuilder connection = new DbConnectionStringBuilder(true);
            connection.Add("Server", Server);
            connection.Add("Database", DataBase);
            connection.Add("Port", Port);
            connection.Add("User", User);
            connection.Add("Password", Password);
            try
            {
                foreach ((string, string) param in parameters)
                {
                    var val = param.ToKeyValue();
                    connection.Add(val.Key, val.Value);
                }
            }
            catch (Exception e)
            {
                MessageBox.Show(e.Message);
            }

            return connection.ConnectionString;
        }


        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public abstract bool OpenConnection();

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public abstract bool CloseConnection();

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        /// <param name="fields"></param>
        /// <returns></returns>
        public abstract IEnumerable<string> SelectQuery(string table, string fields);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        /// <returns></returns>
        public abstract IEnumerable<string> SelectAllQuery(string table);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        /// <param name="fields"></param>
        /// <returns></returns>
        public abstract DataTable GetMapQuery(string table, string fields);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        /// <param name="fields"></param>
        /// <param name="values"></param>
        public abstract void InsertQuery(string table, string fields, string values);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        /// <param name="values"></param>
        public abstract void UpdateQuery(string table, string values);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="table"></param>
        public abstract void DeleteQuery(string table);

        /// <summary>
        /// 
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="func"></param>
        /// <param name="parameters"></param>
        /// <returns></returns>
        public abstract T ExecuteFunction<T>(string func, params string[] parameters);

        /// <summary>
        /// 
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="proc"></param>
        /// <param name="returns"></param>
        /// <param name="parameters"></param>
        public abstract void ExecuteProcedure<T>(string proc, out T returns, params string[] parameters);
    }
}
